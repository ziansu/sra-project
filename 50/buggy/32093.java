public void update(float delta) {
    ticker.updateTick(delta);
    entityManager.update(ticker.getTick());
}