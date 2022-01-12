public void laugh() {
    if (!(isIdle))
        return ;
    
    isLaughing = true;
    laugh = new whackamole.SpriteAnimation(view, javafx.util.Duration.millis(1000), 4, 4, 0, 1260, 140, 140);
    laugh.setCycleCount(3);
    laugh.setOnFinished(( endIdleEvent) -> {
        isIdle = false;
        leave();
    });
    laugh.play();
}