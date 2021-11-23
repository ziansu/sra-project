public void deleteFile(java.io.File file) {
    int retries = 40;
    while (file.exists()) {
        try {
            if (file.exists()) {
                org.apache.commons.io.FileUtils.forceDelete(file);
            }
            break;
        } catch (java.io.IOException e) {
            retries--;
            try {
                java.lang.Thread.sleep(500);
            } catch (java.lang.InterruptedException e1) {
            }
            if (retries == 0) {
                throw new java.lang.IllegalStateException(("Unable to delete file/folder: " + file), e);
            }
        }
    } 
}