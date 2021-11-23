public void resetAddItem() {
    com.androidandyuk.regularreminders.MainActivity.activeReminder = null;
    com.androidandyuk.regularreminders.MainActivity.activeReminderPosition = -1;
    name = ((android.widget.EditText) (findViewById(R.id.nameET)));
    tag = ((android.widget.EditText) (findViewById(R.id.tagET)));
    frequency = ((android.widget.EditText) (findViewById(R.id.frequencyET)));
    name.setText(null);
    name.clearFocus();
    tag.setText(null);
    tag.clearFocus();
    frequency.setText(null);
    frequency.clearFocus();
}