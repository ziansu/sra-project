@java.lang.Override
protected void attachBaseContext(android.content.Context base) {
    super.attachBaseContext(base);
    if (com.plugin.util.ProcessUtil.isPluginProcess(this)) {
        com.plugin.core.PluginLoader.initLoader(this);
    }else {
        com.plugin.core.PluginLoader.initLoader(this);
    }
}