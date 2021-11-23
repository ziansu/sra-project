@java.lang.Override
public void setUp() {
    preferences = new org.tasks.preferences.Preferences(getContext());
    reminderService = new com.todoroo.astrid.reminders.ReminderService(getContext(), preferences);
    org.tasks.Freeze.freezeAt(new org.joda.time.DateTime(2014, 1, 24, 17, 23, 37));
}