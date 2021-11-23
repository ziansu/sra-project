private void runController() {
    timeline = new javafx.animation.Timeline(new javafx.animation.KeyFrame(javafx.util.Duration.seconds(1), ( eve) -> {
        for (sample.Charakter chara : charakters) {
            if (chara.isActive()) {
                chara.move(this);
            }
        }
        levelController();
        view.updateGameField(charakters);
        giveRandomCredits();
        view.updateCredits(credits, this);
    }));
    timeline.setCycleCount(javafx.animation.Animation.INDEFINITE);
    timeline.play();
}