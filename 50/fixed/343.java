@java.lang.Override
public void setUp() {
    preferences = new org.tasks.preferences.Preferences(getContext(), null);
    preferences.clear();
    preferences.setBoolean(R.string.p_rmd_enable_quiet, true);
    org.tasks.Freeze.freezeAt(com.todoroo.astrid.reminders.NotificationsTest.now);
}