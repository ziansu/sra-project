public void startInviteButtonClick(android.view.View view) {
    android.widget.EditText numberOfFriends = ((android.widget.EditText) (findViewById(R.id.numberOfUsers)));
    android.widget.EditText dateAndTime = ((android.widget.EditText) (findViewById(R.id.dateAndTime)));
    android.widget.EditText location = ((android.widget.EditText) (findViewById(R.id.location)));
    Friendnumber = numberOfFriends.getText().toString();
    DateAndTime = dateAndTime.getText().toString();
    Location = location.getText().toString();
    activate();
}