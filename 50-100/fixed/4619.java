public static void byteListToFile(byte[] byteArray, java.io.File file) {
    try {
        java.io.FileOutputStream stream = new java.io.FileOutputStream(file);
        stream.write(byteArray);
        stream.flush();
    } catch (java.io.IOException e) {
        java.lang.System.err.println(e.getMessage());
    }
}