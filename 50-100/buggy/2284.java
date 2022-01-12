public static void write(java.nio.file.Path reportingPath, double value, long ts) {
    try (java.io.DataOutputStream dos = new java.io.DataOutputStream(java.nio.file.Files.newOutputStream(reportingPath, java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND))) {
        dos.writeDouble(value);
        dos.writeLong(ts);
        dos.flush();
    } catch (java.io.IOException e) {
        cc.blynk.server.workers.StorageWorker.log.error("Error open user data reporting file.", e);
    }
}