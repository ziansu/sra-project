public boolean deleteFile() {
    if ((globalFileArray.length) != 0) {
        java.io.File[] filestoSend = globalFileArray;
        for (java.io.File tempFile : filestoSend) {
            return new java.io.File(tempFile.getAbsolutePath()).getAbsoluteFile().delete();
        }
    }
    return false;
}