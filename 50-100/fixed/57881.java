public void show() {
    this.setManaged(true);
    this.setVisible(true);
    javafx.animation.Timeline timeline = new javafx.animation.Timeline();
    timeline.getKeyFrames().addAll(createPositionTranslationFrames(false));
    timeline.getKeyFrames().addAll(createBlurEffectFrames(10, false));
    timeline.play();
}