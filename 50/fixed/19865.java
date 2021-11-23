@java.lang.Override
public void run() {
    registerOutput.setText(java.lang.String.format("Failed: %s", reason));
    registerOutput.setSelected(true);
    registerButton.setEnabled(true);
}