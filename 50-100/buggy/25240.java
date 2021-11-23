private static void saveBytesToFile(byte[] fileBytes, java.io.File yourFile) {
    try {
        java.io.BufferedOutputStream bos = new java.io.BufferedOutputStream(new java.io.FileOutputStream(yourFile));
        bos.write(fileBytes);
        bos.flush();
        bos.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}