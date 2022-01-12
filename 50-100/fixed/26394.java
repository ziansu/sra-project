public void onSetNotification(android.view.View view) {
    if ((minutesBefore.getText()) == null) {
        amountOfTime = 60;
    }else {
        amountOfTime = java.lang.Integer.parseInt(minutesBefore.getText().toString());
    }
    savePreferences();
    createNotification();
    android.widget.Toast.makeText(this, "set", Toast.LENGTH_SHORT);
}