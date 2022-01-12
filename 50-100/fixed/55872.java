@java.lang.Override
public void beforeApplicationLoaded(@org.jetbrains.annotations.NotNull
com.intellij.openapi.application.Application application) {
    com.intellij.ide.plugins.cl.PluginClassLoader pluginClassLoader = getClassLoader();
    if (pluginClassLoader == null) {
        return ;
    }
    java.io.File[] ceylonArchives = getCeylonArchives();
    for (java.io.File carFileToAdd : ceylonArchives) {
        try {
            pluginClassLoader.addURL(carFileToAdd.toURI().toURL());
        } catch (java.net.MalformedURLException e) {
            e.printStackTrace();
        }
    }
}