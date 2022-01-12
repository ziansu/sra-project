@java.lang.Override
public void update() {
    super.update();
    handleInputs();
    for (Bullet bullet : bullets) {
        bullet.update();
    }
}