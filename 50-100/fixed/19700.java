public <T extends net.cubespace.geSuit.core.attachments.Attachment> T addAttachment(T attachment) throws java.lang.IllegalStateException {
    java.lang.Class<? extends net.cubespace.geSuit.core.attachments.Attachment> type = attachment.getClass();
    com.google.common.base.Preconditions.checkState((!(attachments.containsKey(type))));
    attachments.put(type, attachment);
    if ((attachment.getType()) == (net.cubespace.geSuit.core.attachments.Attachment.AttachmentType.Persistent)) {
        attachmentSet.add(type.getName());
        requiresSave = true;
    }
    return attachment;
}