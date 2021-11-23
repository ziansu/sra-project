public void downloadAttachmentContent(com.taskadapter.redmineapi.bean.Attachment issueAttachment, java.io.OutputStream stream) throws com.taskadapter.redmineapi.RedmineException {
    transport.downloadAttachmentContent(issueAttachment, new com.taskadapter.redmineapi.internal.CopyBytesHandler(stream));
}