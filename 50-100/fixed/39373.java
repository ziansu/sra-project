public static com.nequissimus.library.os.OSystem getCurrentOs() {
    final java.lang.String system = java.lang.System.getProperty("os.name").toLowerCase();
    final com.nequissimus.library.os.OSystem[] values = com.nequissimus.library.os.OSystem.values();
    for (final com.nequissimus.library.os.OSystem osystem : values) {
        if ((system.indexOf(osystem.search)) > (-1)) {
            return osystem;
        }
    }
    return com.nequissimus.library.os.OSystem.UNKNOWN;
}