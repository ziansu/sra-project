protected void loadJars(java.nio.file.Path pluginPath, ro.fortsoft.pf4j.PluginClassLoader pluginClassLoader) {
    for (java.lang.String libDirectory : pluginClasspath.getLibDirectories()) {
        java.nio.file.Path file = pluginPath.resolve(libDirectory);
        java.util.List<java.io.File> jars = ro.fortsoft.pf4j.util.FileUtils.getJars(file);
        for (java.io.File jar : jars) {
            pluginClassLoader.addFile(jar);
        }
    }
}