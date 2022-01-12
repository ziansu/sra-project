@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    double v = -1;
    try {
        v = java.lang.Double.parseDouble(s.toString());
    } catch (java.lang.Exception e) {
    }
    if (((v < 0) || (v > 99999)) && (autoStopDistanceCheckBox.isChecked())) {
        autoStopDistanceValueEditText.setError(getText(R.string.Incorrect_value));
    }else
        autoStopDistanceValueEditText.setError(null);
    
}