public void update(float dt) {
    super.update(dt);
    if (((range) != (-1)) && ((delta) >= (range))) {
        if ((getScene()) != null)
            getScene().remove(this);
        else
            dispose();
        
    }
    moveBy(speed);
    delta += speed;
}