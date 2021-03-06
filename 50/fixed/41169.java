private void clear() {
    behaviorManager.remove(gameObjectUpdater);
    gameWorld.clear();
    for (java.lang.String id : state.getLayerIds()) {
        renderManager.unregister(id);
    }
    state.clear();
}