@java.lang.Override
public void doInit() {
    super.doInit();
    forestry.core.PluginCore.blocks.analyzer.init();
    forestry.core.PluginCore.blocks.escritoire.init();
    forestry.core.utils.ForestryModEnvWarningCallable.register();
    AlleleHelper.instance.init();
    Proxies.render.initRendering();
}