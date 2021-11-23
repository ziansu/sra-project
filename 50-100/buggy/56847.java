private void createUIComponents() {
    rootPanel = this;
    closeButton = new overlays.ImageButton(resources.Images.getCloseOverlay());
    addButton = new overlays.ImageButton(resources.Images.getAddContact());
    firstNameTextField = new overlays.HintTextFieldUnderlined("", "Имя", true, true);
    lastNameTextField = new overlays.HintTextFieldUnderlined("", "Фамилия", true, true);
    phoneTextField = new overlays.HintTextFieldUnderlined("", "Телефон", true, true);
}