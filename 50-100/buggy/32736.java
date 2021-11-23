private boolean isInputValid() {
    if (mailBox.getText().isEmpty()) {
        return false;
    }
    if (passwordBox.getText().isEmpty()) {
        return false;
    }
    if ("".equals(roles.getText())) {
        return false;
    }
    return true;
}