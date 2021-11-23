private void checkAttachmentSizeLimit(java.io.InputStream input) {
    byte[] bytes = new byte[1024 * 64];
    int bytesRead;
    long totalBytes = 0;
    try {
        while ((bytesRead = input.read(bytes)) > 0) {
            totalBytes = totalBytes + bytesRead;
        } 
        if ((totalBytes / 1024) > 15000)
            throw new java.io.IOException("Attachment size exceeds 15 MB limit.");
        
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(("Error reading input. " + (e.getMessage())), e);
    }
}