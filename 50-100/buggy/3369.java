@java.lang.Override
public void onClick(android.view.View v) {
    com.plugin.core.ui.PluginDispatcher.startFragmentWithSimpleActivity(this, entry.getKey());
    if (entry.getKey().equals("test1")) {
        com.plugin.core.ui.PluginDispatcher.startFragmentWithBuildInActivity(this, entry.getKey());
    }
}