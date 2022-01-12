public void startInviteButtonClick(android.view.View view) {
    android.widget.EditText dateAndTime = ((android.widget.EditText) (findViewById(R.id.dateAndTime)));
    android.widget.EditText location = ((android.widget.EditText) (findViewById(R.id.location)));
    DateAndTime = dateAndTime.getText().toString();
    Location = location.getText().toString();
    activate();
}