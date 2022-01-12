public boolean checkFieldsFill() {
    java.lang.System.out.println(capasityField.textProperty().getValue());
    if (((((descriptionField.textProperty().getName()) != "") && ((toField.textProperty().getValue()) != "")) && ((fromField.textProperty().getValue()) != "")) && ((capasityField.textProperty().getValue()) != "")) {
        return true;
    }
    return false;
}