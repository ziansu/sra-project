public void refreshFields() {
    firstNameField.setText(mainController.getCharacter().getFirstName());
    lastNameField.setText(mainController.getCharacter().getLastName());
    sizeField.setText(mainController.getCharacter().getSize());
    ageField.setText(mainController.getCharacter().getAge());
    careerComboBox.setValue(mainController.getCharacter().getCareer());
    raceComboBox.setValue(mainController.getCharacter().getRace());
}