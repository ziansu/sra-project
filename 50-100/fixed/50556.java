public boolean deleteFile() {
    if ((globalFileArray.length) != 0) {
        boolean temp = false;
        java.io.File[] filestoSend = globalFileArray;
        for (java.io.File tempFile : filestoSend) {
            temp = new java.io.File(tempFile.getAbsolutePath()).getAbsoluteFile().delete();
        }
        return temp;
    }
    return false;
}