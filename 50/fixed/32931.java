public static boolean isVersionSupported(java.lang.String v) {
    for (cz.GravelCZLP.TracerBlocker.Version ver : cz.GravelCZLP.TracerBlocker.Version.values()) {
        if (ver.getVersion().contains(v)) {
            return true;
        }
    }
    return false;
}