private void build() {
    java.util.Objects.requireNonNull(clusterAccess, "clusterAccess");
    java.util.Objects.requireNonNull(log, "log");
    this.resolvedMode = clusterAccess.resolvePlatformMode(platformMode, log);
    if (((resolvedMode) != (io.fabric8.maven.core.config.PlatformMode.kubernetes)) && ((resolvedMode) != (io.fabric8.maven.core.config.PlatformMode.openshift))) {
        throw new java.lang.IllegalArgumentException(((("Unknown platform mode " + (platformMode)) + " resolved as ") + (resolvedMode)));
    }
    this.client = clusterAccess.createDefaultClient(log);
}