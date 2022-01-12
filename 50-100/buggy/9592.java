@javafx.fxml.FXML
void clearTabs() {
    javafx.scene.control.Tab[] temp = new javafx.scene.control.Tab[_tabpane.getTabs().size()];
    temp = _tabpane.getTabs().toArray(temp);
    for (javafx.scene.control.Tab t : temp) {
        if (!(t.getText().equals("Home")))
            _tabpane.getTabs().remove(t);
        
    }
}