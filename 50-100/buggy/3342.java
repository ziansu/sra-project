@java.lang.Override
public void deleteShare(org.linagora.linshare.core.domain.entities.ShareEntry share) throws org.linagora.linshare.core.exception.BusinessException {
    shareEntryRepository.delete(share);
    org.linagora.linshare.core.domain.entities.DocumentEntry documentEntry = share.getDocumentEntry();
    documentEntry.getShareEntries().remove(share);
    org.linagora.linshare.core.domain.entities.Account recipient = share.getRecipient();
    recipient.getShareEntries().remove(share);
    org.linagora.linshare.core.domain.entities.Account sender = share.getEntryOwner();
    sender.getEntries().remove(share);
    documentEntryRepository.update(documentEntry);
    accountService.update(recipient);
    accountService.update(sender);
}