public java.lang.String getSpinnerValue() {
    android.widget.Spinner mySpinner = ((android.widget.Spinner) (findViewById(R.id.number_spinner)));
    return mySpinner.getSelectedItem().toString();
}