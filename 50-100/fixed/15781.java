@java.lang.Override
public void deleteAnonymousShare(org.linagora.linshare.core.domain.entities.AnonymousShareEntry anonymousShare) throws org.linagora.linshare.core.exception.BusinessException {
    anonymousShareEntryRepository.delete(anonymousShare);
    org.linagora.linshare.core.domain.entities.DocumentEntry documentEntry = anonymousShare.getDocumentEntry();
    documentEntry.getAnonymousShareEntries().remove(anonymousShare);
    org.linagora.linshare.core.domain.entities.Account sender = anonymousShare.getEntryOwner();
    sender.getEntries().remove(anonymousShare);
    documentEntryRepository.update(documentEntry);
}