public com.taskadapter.redmineapi.bean.Attachment uploadAttachment(final java.lang.String contentType, final java.io.File content) throws com.taskadapter.redmineapi.RedmineException, java.io.IOException {
    final java.io.InputStream is = new java.io.FileInputStream(content);
    try {
        return uploadAttachment(content.getName(), contentType, is, content.length());
    } finally {
        is.close();
    }
}