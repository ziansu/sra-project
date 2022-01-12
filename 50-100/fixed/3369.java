@java.lang.Override
public void onClick(android.view.View v) {
    if (!(entry.getKey().equals("test1"))) {
        com.plugin.core.ui.PluginDispatcher.startFragmentWithSimpleActivity(this, entry.getKey());
    }
    com.plugin.core.ui.PluginDispatcher.startFragmentWithBuildInActivity(this, entry.getKey());
}