public void buildScore(java.util.HashMap<java.lang.String, int[]> scores) {
    javafx.application.Platform.runLater(() -> {
        this.addToLobbyChat("DEBUG", "Zeige jetzt die Players Scores an");
        controller.buildPlayersScoresList(scores);
    });
}