public void button_clear(android.view.View view) {
    chkEventType.setChecked(false);
    chkName.setChecked(false);
    chkSubType.setChecked(false);
    spnEventTypeSpinner.setSelection(0);
    spnEventSubtypeSpinner.setEnabled(false);
    spnEventSubtypeSpinner.setClickable(false);
    txtName.setText("");
}