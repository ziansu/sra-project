public java.lang.String validateControls() {
    if ((cb.getValue()) == null) {
        return "Market type is not selected";
    }
    if (marketCodeField.getText().isEmpty()) {
        return "Market code can not be empty";
    }
    if (dataPathField.getText().isEmpty()) {
        return "The data source path can not be empty.";
    }
    return null;
}