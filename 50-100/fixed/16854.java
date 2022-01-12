private void okButtonEvent() {
    if ((listViewHistory.getSelectionModel().getSelectedItem()) != null) {
        mainWindowController.configureTree(((java.io.File) (listViewHistory.getSelectionModel().getSelectedItem())));
        final javafx.stage.Stage historyStage;
        historyStage = ((javafx.stage.Stage) (buttonOK.getScene().getWindow()));
        historyStage.close();
    }else {
        java.lang.System.out.println("Error: No directory of history choosen...");
    }
}