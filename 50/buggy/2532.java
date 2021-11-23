@java.lang.Override
public void onResume() {
    super.onResume();
    mNotificationsEnabled = org.wordpress.android.ui.notifications.utils.NotificationsUtils.isNotificationsEnabled(getActivity());
    if (hasNotificationsSettings()) {
        new org.wordpress.android.ui.prefs.notifications.NotificationsSettingsFragment.LoadNotificationsTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, true);
    }
    refreshSettings();
}