@javafx.fxml.FXML
void closeTab() {
    for (javafx.scene.control.Tab t : _tabpane.getTabs()) {
        if (((t != null) && (t.isSelected())) && (!(t.getText().equals("Home")))) {
            _tabpane.getTabs().remove(t);
            break;
        }
    }
}