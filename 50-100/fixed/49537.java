public com.taskadapter.redmineapi.bean.Attachment uploadAttachment(final java.lang.String fileName, final java.lang.String contentType, final byte[] content) throws com.taskadapter.redmineapi.RedmineException, java.io.IOException {
    final java.io.InputStream is = new java.io.ByteArrayInputStream(content);
    try {
        return uploadAttachment(fileName, contentType, is, content.length);
    } finally {
        try {
            is.close();
        } catch (final java.io.IOException e) {
            throw new com.taskadapter.redmineapi.RedmineInternalError("Unexpected exception", e);
        }
    }
}