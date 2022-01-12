@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    action = getIntent().getAction();
    if ((action) != null)
        setCorrectTheme();
    
    setContentView(R.layout.activity_main);
    reminderMessageTextView = ((android.widget.TextView) (findViewById(R.id.tv_reminder_message)));
    handleIncomingFromNotification();
    husaynhakeem.io.focusreminder.utilities.ReminderUtils.scheduleFocusReminder(this);
}