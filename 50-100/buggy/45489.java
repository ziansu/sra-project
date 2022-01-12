@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    location = eventLocationEditText.getText().toString();
    if (((name.isEmpty()) || ((name.length()) < 15)) && (!(nameValid))) {
        eventLocationEditText.setError("Need at least 15 characters");
        createEventButton.setEnabled(false);
        locationValid = false;
    }else {
        createEventButton.setEnabled(true);
        locationValid = true;
    }
}