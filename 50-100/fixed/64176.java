@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    keyInput = ((android.widget.EditText) (dialogView.findViewById(R.id.dialog_key_input)));
    keyInput.setText(propertyKey);
    keyInput.addTextChangedListener(new org.tpmkranz.smsforward.SetupActivity.ClearErrorOnInputListener(keyInput));
    valueInput = ((android.widget.EditText) (dialogView.findViewById(R.id.dialog_value_input)));
    valueInput.setText(propertyValue);
    valueInput.addTextChangedListener(new org.tpmkranz.smsforward.SetupActivity.ClearErrorOnInputListener(valueInput));
}