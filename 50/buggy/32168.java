@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton checkbox, boolean isChecked) {
    emailEditText.setEnabled(((checkbox.isEnabled()) && isChecked));
    emailEditText.requestFocus();
}