@com.couchbase.lite.internal.InterfaceAudience.Public
public com.couchbase.lite.Attachment getAttachment(java.lang.String name) {
    java.util.Map<java.lang.String, java.lang.Object> attachmentsMetadata = getAttachmentMetadata();
    if (attachmentsMetadata == null) {
        return null;
    }
    java.util.Map<java.lang.String, java.lang.Object> attachmentMetadata = ((java.util.Map<java.lang.String, java.lang.Object>) (attachmentsMetadata.get(name)));
    if (attachmentMetadata == null) {
        return null;
    }
    return new com.couchbase.lite.Attachment(this, name, attachmentMetadata);
}