public static org.gnieh.logback.SystemdJournalLibrary loadLibrary() {
    try {
        return ((org.gnieh.logback.SystemdJournalLibrary) (com.sun.jna.Native.loadLibrary("systemd", org.gnieh.logback.SystemdJournalLibrary.class)));
    } catch (java.lang.Throwable t) {
        return ((org.gnieh.logback.SystemdJournalLibrary) (com.sun.jna.Native.loadLibrary("systemd-journal", org.gnieh.logback.SystemdJournalLibrary.class)));
    }
}