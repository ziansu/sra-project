public static void disconnectAll(final long retardationTime) {
    synchronized(de.thjom.java.systemd.Systemd.instances) {
        for (de.thjom.java.systemd.Systemd instance : de.thjom.java.systemd.Systemd.instances) {
            if (instance != null) {
                try {
                    instance.close(retardationTime);
                } catch (final java.lang.InterruptedException e) {
                    de.thjom.java.systemd.Systemd.log.error("Disconnection interrupted while retarding", e);
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
        java.util.Arrays.fill(de.thjom.java.systemd.Systemd.instances, null);
    }
}