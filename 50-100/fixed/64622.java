public void updateList() {
    for (javafx.scene.control.Tab tab : tabs.getTabs()) {
        if (tab instanceof movieindexer.ImdbList) {
            cbOptions.add(tab.getText());
        }
    }
    if ((cbOptions.size()) == 0) {
        addNewTab("Movies", this, true);
    }
    choicebox.getSelectionModel().select(0);
    if ((cbOptions.size()) == 1) {
        remButton_list.setDisable(true);
    }
}