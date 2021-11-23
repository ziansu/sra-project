@java.lang.Override
public void disposeScene() {
    camera.setHUD(null);
    snake.dispose();
    snake.detachSelf();
    foods.detachSelf();
    foods.dispose();
    this.detachSelf();
    this.dispose();
}