public void transport() {
    worldState.setCurrentWorld(destination);
    worldState.getCurrentWorld().initialize();
    worldState.getNPCManager().initialize();
}