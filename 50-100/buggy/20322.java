@java.lang.Override
public void run() {
    org.helioviewer.jhv.base.plugin.controller.PluginManager.getSingletonInstance().addPlugin(org.helioviewer.jhv.plugins.eveplugin.EVEPlugin.class.getClassLoader(), new org.helioviewer.jhv.plugins.eveplugin.EVEPlugin(), null);
    org.helioviewer.jhv.base.plugin.controller.PluginManager.getSingletonInstance().addPlugin(org.helioviewer.jhv.plugins.swek.SWEKPlugin.class.getClassLoader(), new org.helioviewer.jhv.plugins.swek.SWEKPlugin(), null);
    org.helioviewer.jhv.base.plugin.controller.PluginManager.getSingletonInstance().addPlugin(org.helioviewer.jhv.plugins.pfssplugin.PfssPlugin.class.getClassLoader(), new org.helioviewer.jhv.plugins.pfssplugin.PfssPlugin(), null);
}