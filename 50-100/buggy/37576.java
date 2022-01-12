public static cz.GravelCZLP.TracerBlocker.Loader getLoaderByVersion(java.lang.String version, cz.GravelCZLP.TracerBlocker.TracerBlocker tracerBlocker, com.comphenix.protocol.ProtocolManager protocolManager) {
    for (cz.GravelCZLP.TracerBlocker.Version ver : cz.GravelCZLP.TracerBlocker.Version.values()) {
        if (ver.getVersion().equalsIgnoreCase(version)) {
            return ver.getLoader(tracerBlocker, protocolManager);
        }
    }
    return null;
}