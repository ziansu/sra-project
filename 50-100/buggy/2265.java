public boolean setValidations() {
    if (((enteredInductanceValue.getText().toString().length()) < 2) || (enteredInductancePower.getText().toString().equals(""))) {
        android.widget.Toast.makeText(getBaseContext(), "Invalid data entered", Toast.LENGTH_SHORT).show();
        return false;
    }
    return true;
}