public void update(float delta, com.episkleaves.bulletmadness2.state.GameState gameState) {
    timer += delta;
    setSpeed(((float) (java.lang.Math.abs(((java.lang.Math.sin(java.lang.Math.toRadians((((timer) * (period)) * 180)))) * (originalSpeed))))));
    move(delta);
}