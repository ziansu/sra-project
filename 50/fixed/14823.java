public void updateY(double dt) {
    updateDy(dt);
    setPrevY();
    moveY(((dy) * dt));
}