public void disableSessionChosing(boolean value) {
    sessionComboBox.setDisable(value);
    newSessionField.setDisable(((value || ((sessionComboBox.getValue()) == null)) || (!(sessionComboBox.getValue().equals(com.cbapps.reversi.client.LoginLayout.ITEM_NEW_SESSION)))));
}