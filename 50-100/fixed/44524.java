@java.lang.Override
public java.util.List<com.zimbra.cs.imap.ImapMessage> openImapFolder(com.zimbra.cs.mailbox.OperationContext octxt, com.zimbra.common.mailbox.ItemIdentifier folderId) throws com.zimbra.common.service.ServiceException {
    java.util.List<com.zimbra.cs.imap.ImapMessage> msgs = new java.util.ArrayList<com.zimbra.cs.imap.ImapMessage>();
    java.lang.Integer chunkSize = com.zimbra.cs.account.Provisioning.getInstance().getLocalServer().getOpenImapFolderRequestChunkSize();
    for (com.zimbra.soap.account.message.ImapMessageInfo msg : zMailbox.openImapFolder(folderId.id, chunkSize)) {
        msgs.add(new com.zimbra.cs.imap.ImapMessage(msg));
    }
    return msgs;
}