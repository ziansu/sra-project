public static void writeFile(java.lang.String toWrite) {
    try (java.io.FileOutputStream outputStream = new java.io.FileOutputStream(Bastille.filename)) {
        byte[] data = toWrite.getBytes();
        java.util.Base64.Encoder encoder = java.util.Base64.getEncoder();
        data = encoder.encode(data);
        outputStream.write(data);
        outputStream.close();
    } catch (java.lang.Exception e) {
        java.lang.System.err.println((("Error while writing to file '" + (Bastille.filename)) + "'!"));
    }
}