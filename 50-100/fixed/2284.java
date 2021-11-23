public static void write(java.nio.file.Path reportingPath, double value, long ts) throws java.io.IOException {
    try (java.io.DataOutputStream dos = new java.io.DataOutputStream(java.nio.file.Files.newOutputStream(reportingPath, java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND))) {
        dos.writeDouble(value);
        dos.writeLong(ts);
        dos.flush();
    }
}