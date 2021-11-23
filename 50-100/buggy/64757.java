@javafx.fxml.FXML
void closeTab() {
    for (javafx.scene.control.Tab t : _tabpane.getTabs()) {
        java.lang.System.out.println(t.getText());
        if ((t.isSelected()) && (!(t.getText().equals("Home")))) {
            _tabpane.getTabs().remove(t);
            break;
        }
    }
}