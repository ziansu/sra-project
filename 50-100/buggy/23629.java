@java.lang.Override
public void onFailure(java.lang.String message) {
    if (message == null) {
        android.util.Log.w(treehou.se.habit.ui.SitemapListFragment.TAG, "No server to connect to");
    }else {
        android.util.Log.w(treehou.se.habit.ui.SitemapListFragment.TAG, ((("Failed to connect to server " + message) + " ") + (server.getUrl())));
    }
    mSitemapAdapter.setServerState(server, treehou.se.habit.ui.SitemapListFragment.SitemapItem.STATE_ERROR);
}