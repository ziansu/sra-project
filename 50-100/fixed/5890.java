@org.jetbrains.annotations.NotNull
protected static java.io.File getLoaderFile(java.lang.Class<?> clazz, java.lang.String fileName) {
    com.intellij.ide.plugins.cl.PluginClassLoader classLoader = ((com.intellij.ide.plugins.cl.PluginClassLoader) (clazz.getClassLoader()));
    com.intellij.ide.plugins.IdeaPluginDescriptor plugin = com.intellij.ide.plugins.PluginManager.getPlugin(classLoader.getPluginId());
    assert plugin != null;
    return new java.io.File(new java.io.File(plugin.getPath(), "loader"), fileName);
}