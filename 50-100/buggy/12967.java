public void openSQLConnection() {
    sqlConnection.createConnection();
    createConnection.setDisable(true);
    clear.setDisable(false);
    closeConnection.setDisable(false);
    sentRequest.setDisable(false);
    additionalQueryBox.setDisable(false);
    addQueryToCollection.setDisable(false);
    openConnection.setDisable(true);
    offConnection.setDisable(false);
    investigation.setDisable(false);
    this.isConnected = true;
}