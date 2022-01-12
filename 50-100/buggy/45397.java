public void transport() {
    worldState.setCurrentWorld(getDestination());
    worldState.getCurrentWorld().setPosition(worldState.getCurrentWorld().position.add(new visualje.Vector2D(0, 1)));
    worldState.getCurrentWorld().initialize();
}