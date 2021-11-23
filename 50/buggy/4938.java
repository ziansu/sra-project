@javafx.fxml.FXML
private void handleCancel() {
    StoreScreenController.currentPlayer.removeMule(this.mule);
    dialogStage.close();
}