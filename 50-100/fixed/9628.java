public java.net.URLClassLoader createClassLoader() {
    boolean useBoot14Layout = false;
    for (org.springframework.boot.loader.archive.Archive.Entry entry : archive) {
        if (entry.getName().startsWith(org.springframework.cloud.dataflow.configuration.metadata.BootClassLoaderFactory.BOOT_14_LIBS_LOCATION)) {
            useBoot14Layout = true;
            break;
        }
    }
    org.springframework.cloud.dataflow.configuration.metadata.BootClassLoaderFactory.ClassLoaderExposingLauncher launcher = (useBoot14Layout) ? new org.springframework.cloud.dataflow.configuration.metadata.BootClassLoaderFactory.Boot14ClassLoaderExposingLauncher() : new org.springframework.cloud.dataflow.configuration.metadata.BootClassLoaderFactory.Boot13ClassLoaderExposingLauncher();
    return launcher.createClassLoader();
}