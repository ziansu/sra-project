public void updatePlayerList(java.util.List<java.lang.String> playerList) {
    javafx.collections.ObservableList<java.lang.String> list = javafx.collections.FXCollections.observableArrayList(playerList);
    this.playerList.setItems(list);
}