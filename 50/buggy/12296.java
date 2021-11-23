public void handle_prev_button(javafx.event.ActionEvent e) {
    tabIndex = ((--(tabIndex)) < 0) ? tabs.getTabs().size() : tabIndex;
    tabs.getSelectionModel().select(tabIndex);
}