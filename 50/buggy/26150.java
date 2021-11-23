private boolean isInputValid() {
    if (searchBox.getText().isEmpty()) {
        return false;
    }
    if ("".equals(searchOptions.getText())) {
        return false;
    }
    return true;
}