private void toggleButtonPressed(javafx.scene.control.ToggleButton pressed, javafx.scene.control.ToggleButton other) {
    other.setDisable(pressed.isSelected());
    fireTestUnitEvent(pressed);
    setFieldsDisabled(pressed.isSelected(), pressed.getUserData().toString());
}