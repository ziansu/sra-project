public static final boolean isPluginProcess(android.content.Context context) {
    java.lang.String currentProcessName = com.morgoo.droidplugin.core.PluginProcessManager.getCurrentProcessName(context);
    if (android.text.TextUtils.equals(currentProcessName, context.getPackageName()))
        return false;
    
    com.morgoo.droidplugin.core.PluginProcessManager.initProcessList(context);
    return !(com.morgoo.droidplugin.core.PluginProcessManager.sProcessList.contains(currentProcessName));
}