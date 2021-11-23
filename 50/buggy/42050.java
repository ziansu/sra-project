public void buildList(java.util.HashMap<java.lang.String, java.lang.Integer> onlineUsers) {
    javafx.application.Platform.runLater(() -> {
        this.addToLobbyChat("DEBUG", "Zeige jetzt die Online Users an");
        controller.buildPlayersVBox(onlineUsers);
    });
}