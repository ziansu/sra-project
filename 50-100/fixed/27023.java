public void updateInstance(android.app.Activity mainActivitysCurrentInstance) {
    this.mainActivity = mainActivitysCurrentInstance;
    ((android.widget.Button) (mainActivity.findViewById(R.id.DONEButton))).setEnabled(doneButtonsEnabledStatus);
    ((android.widget.Button) (mainActivity.findViewById(R.id.NEXTButton))).setEnabled(nextButtonsEnabledStatus);
    ((android.widget.EditText) (mainActivity.findViewById(R.id.enter_name_field))).setEnabled(nameEntryFieldsEnabledStatus);
    ((android.widget.TextView) (mainActivity.findViewById(R.id.dispensingTextView))).setText(dispensingText);
}