@java.lang.Override
public void update() {
    handleInputs();
    super.update();
    for (Bullet bullet : bullets) {
        bullet.update();
    }
}