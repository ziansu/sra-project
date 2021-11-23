public boolean checkFieldsFill() {
    if ((((!(descriptionField.textProperty().getValue().isEmpty())) && ((toField.textProperty().getValue()) != "")) && ((fromField.textProperty().getValue()) != "")) && ((capasityField.textProperty().getValue()) != "")) {
        return true;
    }
    return false;
}