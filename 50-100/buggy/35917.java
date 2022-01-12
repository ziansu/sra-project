@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.String timeText = s.toString();
    if (!(timeText.equals(""))) {
        freq = java.lang.Integer.parseInt(timeText);
        isTimeValid = (freq) > 0;
    }
    checkInputValidity();
}