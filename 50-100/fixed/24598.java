public static void close() {
    for (java.io.Writer writer : com.emc.storageos.db.client.impl.DbCheckerFileWriter.writers.values()) {
        try {
            if (writer != null) {
                writer.close();
                writer = null;
            }
        } catch (java.io.IOException e) {
            com.emc.storageos.db.client.impl.DbCheckerFileWriter.log.error("Exception happens when closing file, e=", e);
        }
    }
}