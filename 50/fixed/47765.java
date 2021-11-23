public void buildScore(java.util.HashMap<java.lang.String, int[]> scores) {
    javafx.application.Platform.runLater(() -> {
        controller.buildPlayersScoresList(scores);
    });
}