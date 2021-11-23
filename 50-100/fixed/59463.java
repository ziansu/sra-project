public static byte[] fileToByteArray(java.io.File file) {
    byte[] buffer = null;
    java.io.FileInputStream fileInputStream = null;
    try {
        fileInputStream = new java.io.FileInputStream(file);
        buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
    } catch (java.io.IOException e) {
        java.lang.System.err.println("Error on file reading.");
    } finally {
    }
    return buffer;
}