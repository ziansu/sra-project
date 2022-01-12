@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {
    confirm.setEnabled(true);
    android.widget.RadioButton radioButton = ((android.widget.RadioButton) (group.findViewById(checkedId)));
    if (radioButton != null) {
        givenAnswer[0] = java.lang.String.valueOf(radioButton.getText());
    }
}