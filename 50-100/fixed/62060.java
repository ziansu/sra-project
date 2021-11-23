public io.fabric8.maven.core.config.PlatformMode resolvePlatformMode(io.fabric8.maven.core.config.PlatformMode mode, io.fabric8.maven.docker.util.Logger log) {
    io.fabric8.maven.core.config.PlatformMode resolvedMode;
    if (mode == null) {
        mode = io.fabric8.maven.core.config.PlatformMode.DEFAULT;
    }
    if (mode.isAuto()) {
        resolvedMode = (isOpenShift(log)) ? io.fabric8.maven.core.config.PlatformMode.openshift : io.fabric8.maven.core.config.PlatformMode.kubernetes;
    }else {
        resolvedMode = mode;
    }
    log.info("Running in %s mode", resolvedMode.getLabel());
    return resolvedMode;
}