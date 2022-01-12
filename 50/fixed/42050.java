public void buildList(java.util.HashMap<java.lang.String, java.lang.Integer> onlineUsers) {
    javafx.application.Platform.runLater(() -> {
        controller.buildPlayersVBox(onlineUsers);
    });
}