public java.lang.ClassLoader getScriptClassloader() {
    scriptClassloaderLock.lock();
    try {
        if ((scriptClassloader) == null) {
            java.net.URL[] urls = findClasspathForScripts(java.lang.System.getProperty("cp"));
            scriptClassloader = com.focusit.jsflight.script.ScriptsClassLoaderFactory.createScriptsClassLoader(getClass().getClassLoader(), urls);
            com.focusit.jsflight.player.configurations.CommonConfiguration.LOG.info("Urls, used for scripts classloader: {}", ((java.lang.Object) (urls)));
        }
        return scriptClassloader;
    } finally {
        scriptClassloaderLock.unlock();
    }
}