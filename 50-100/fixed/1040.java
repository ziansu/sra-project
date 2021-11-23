public void start() {
    for (int i = 0; i < 4; i++) {
        players.add(new application.model.Player(this));
        labelScore[i].setVisible(true);
        labelName[i].setVisible(true);
    }
    currentColourId = 3;
    boardM.setActive(true);
    timeline = new javafx.animation.Timeline(new javafx.animation.KeyFrame(javafx.util.Duration.millis(100), ( ae) -> transitionMove()));
    timeline.play();
}