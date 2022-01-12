public static final boolean isPluginProcess(android.content.Context context) {
    com.morgoo.droidplugin.core.PluginProcessManager.initProcessList(context);
    java.lang.String currentProcessName = com.morgoo.droidplugin.core.PluginProcessManager.getCurrentProcessName(context);
    return (!(android.text.TextUtils.equals(currentProcessName, context.getPackageName()))) && (!(com.morgoo.droidplugin.core.PluginProcessManager.sProcessList.contains(currentProcessName)));
}