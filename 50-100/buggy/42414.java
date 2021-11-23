@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    long v = -1;
    try {
        v = java.lang.Long.parseLong(s.toString());
    } catch (java.lang.Exception e) {
    }
    if (((v < 0) || (v > 99999)) && (autoStopTimeCheckBox.isChecked())) {
        autoStopTimeValueEditText.setError(getText(R.string.Incorrect_value));
    }else
        autoStopTimeValueEditText.setError(null);
    
}