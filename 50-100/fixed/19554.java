protected void loadClock() {
    final javafx.animation.Timeline timeline = new javafx.animation.Timeline(new javafx.animation.KeyFrame(javafx.util.Duration.seconds(1), new javafx.event.EventHandler<javafx.event.ActionEvent>() {
        @java.lang.Override
        public void handle(javafx.event.ActionEvent event) {
            clock.setText(getCurrentTime());
            if ((java.time.LocalDateTime.now().getSecond()) == 0) {
                update();
            }
        }
    }));
    timeline.setCycleCount(javafx.animation.Animation.INDEFINITE);
    timeline.play();
}