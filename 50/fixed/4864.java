protected boolean isInputInteger(javafx.scene.control.TextField t) {
    return t.getText().trim().matches("^[0-9]+$");
}