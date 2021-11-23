private void AddTextFields() {
    newField1.setVisible(false);
    newField2.setVisible(false);
    newField3.setVisible(false);
    newField4.setVisible(false);
    if ((fxml_controller.MultiplayerController02.players) >= 2) {
        newField1.setVisible(true);
        newField2.setVisible(true);
    }
    if ((fxml_controller.MultiplayerController02.players) >= 3) {
        newField3.setVisible(true);
    }
    if ((fxml_controller.MultiplayerController02.players) == 4) {
        newField4.setVisible(true);
    }
    java.lang.System.out.println("zweiter test gut");
}