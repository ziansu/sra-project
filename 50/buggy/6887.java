private void refreshInputMultiplexer() {
    inputMultiplexer.clear();
    inputMultiplexer.addProcessor(stage);
    inputMultiplexer.addProcessor(gameInputListener);
}