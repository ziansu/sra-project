public void update(float dt) {
    super.update(dt);
    if (((range) != (-1)) && ((delta) >= (range))) {
        dispose();
        getScene().remove(this);
    }
    moveBy(speed);
    delta += speed;
}