private android.widget.Button getAttendeeNameButton() {
    android.widget.Button attendeeNameButton = null;
    if ((getContext()) != null) {
        attendeeNameButton = ((android.widget.Button) (((android.app.Activity) (getContext())).findViewById(R.id.attendeeNameButton)));
    }
    return attendeeNameButton;
}