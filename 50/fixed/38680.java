@java.lang.Override
public void disposeScene() {
    snake.detachSelf();
    foods.detachSelf();
    foods.dispose();
    this.detachSelf();
    this.dispose();
}