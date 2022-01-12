@java.lang.Override
public void onClick(android.view.View v) {
    if (!(wizardPropertiesExpDateEditText.getText().toString().equals(""))) {
        wizardPropertiesExpDateEditText.setText("");
        wizardPropertiesEraseDateButton.setVisibility(View.GONE);
    }
}