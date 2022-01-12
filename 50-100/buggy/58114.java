protected final void buildAndSetGameLoop() {
    final javafx.util.Duration oneFrameAmt = javafx.util.Duration.seconds(getFramesPerSecond());
    final javafx.animation.KeyFrame oneFrame = new javafx.animation.KeyFrame(oneFrameAmt, new javafx.event.EventHandler<javafx.event.ActionEvent>() {
        @java.lang.Override
        public void handle(javafx.event.ActionEvent event) {
            updateBoard();
            updateSprites();
            cleanupSprites();
        }
    });
    nl.tudelft.bejeweled.game.Game.setGameLoop(javafx.animation.TimelineBuilder.create().cycleCount(javafx.animation.Animation.INDEFINITE).keyFrames(oneFrame).build());
}