@java.lang.Override
public void reloadListFragment() {
    android.util.Log.i(org.openbmap.activities.StartscreenActivity.TAG, "Refreshing session list fragment");
    final org.openbmap.activities.SessionListFragment sessionFrag = ((org.openbmap.activities.SessionListFragment) (getSupportFragmentManager().findFragmentByTag("session")));
    if (sessionFrag != null) {
        sessionFrag.refreshAdapter();
    }
}