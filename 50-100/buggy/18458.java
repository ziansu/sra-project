@org.gradle.api.tasks.TaskAction
public void copyFiles() throws java.io.IOException {
    com.diffplug.gradle.FileMisc.cleanDir(installDir);
    java.io.File pluginsDir = new java.io.File(installDir, "plugins");
    pluginsDir.mkdirs();
    for (java.io.File plugin : source.resolvedFiles()) {
        com.diffplug.gradle.p2.ParsedJar parsed = new com.diffplug.gradle.p2.ParsedJar(plugin);
        java.lang.String name = (((parsed.getSymbolicName()) + "_") + (parsed.getVersion())) + ".jar";
        com.diffplug.common.io.Files.copy(plugin, new java.io.File(pluginsDir, name));
    }
}