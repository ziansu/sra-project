public void renderObjects() {
    batch.enableBlending();
    batch.begin();
    renderObstacles();
    renderSpot();
    batch.end();
}