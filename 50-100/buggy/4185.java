@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    action = getIntent().getAction();
    if ((action) != null)
        setCorrectTheme();
    
    setContentView(R.layout.activity_main);
    reminderMessageTextView = ((android.widget.TextView) (findViewById(R.id.tv_reminder_message)));
    reminderMessageTextView.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            husaynhakeem.io.focusreminder.utilities.NotificationUtils.remindUserToFocus(husaynhakeem.io.focusreminder.MainActivity.this);
        }
    });
    handleIncomingFromNotification();
    husaynhakeem.io.focusreminder.utilities.ReminderUtils.scheduleFocusReminder(this);
}