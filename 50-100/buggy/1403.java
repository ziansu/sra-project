public void idle() {
    if (((isEmerging) || (isFading)) || (isIdle))
        return ;
    
    java.lang.System.out.println("Idle play");
    isIdle = true;
    idle = new whackamole.SpriteAnimation(view, javafx.util.Duration.millis(1500), 6, 6, 0, 1540, 140, 140);
    idle.setCycleCount(3);
    idle.setOnFinished(( endIdleEvent) -> laugh());
    idle.play();
}