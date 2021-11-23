@java.lang.Override
public void onRemove(java.lang.String packageName, boolean success) {
    android.content.Intent intent = new android.content.Intent(ACTION_PLUGIN_CHANGED);
    intent.putExtra(com.plugin.core.manager.PluginCallbackImpl.extra_type, "remove");
    intent.putExtra(com.plugin.core.manager.PluginCallbackImpl.extra_id, packageName);
    intent.putExtra(com.plugin.core.manager.PluginCallbackImpl.extra_result_code, (success ? 1 : 0));
    com.plugin.core.PluginLoader.getApplication().sendBroadcast(intent);
}