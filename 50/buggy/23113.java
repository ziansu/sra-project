public void act(float delta) {
    super.act(delta);
    if (ballHitHole()) {
        levelEnded();
        started = false;
    }
}