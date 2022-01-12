private static void saveBytesToFile(byte[] fileBytes, java.io.File file) {
    try {
        java.io.BufferedOutputStream bos = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
        bos.write(fileBytes);
        bos.flush();
        bos.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}