@java.lang.Override
public void run() {
    if (this.isFinishing()) {
        return ;
    }
    final org.mozilla.gecko.tabs.TabHistoryFragment fragment = org.mozilla.gecko.tabs.TabHistoryFragment.newInstance(historyPageList, toIndex);
    final android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    org.mozilla.gecko.GeckoAppShell.vibrateOnHapticFeedbackEnabled(getResources().getIntArray(R.array.long_press_vibrate_msec));
    if (this.isForegrounded())
        fragment.show(R.id.tab_history_panel, fragmentManager.beginTransaction(), org.mozilla.gecko.BrowserApp.TAB_HISTORY_FRAGMENT_TAG);
    
}