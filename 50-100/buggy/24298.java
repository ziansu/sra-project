public void refreshFields() {
    firstNameField.setText(mainController.getCharacter().getFirstName());
    lastNameField.setText(mainController.getCharacter().getLastName());
    sizeField.setText(mainController.getCharacter().getSize());
    ageField.setText(mainController.getCharacter().getAge());
    raceComboBox.setValue(mainController.getCharacter().getRace());
    careerComboBox.setValue(mainController.getCharacter().getCareer());
}