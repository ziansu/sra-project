public com.bladecoder.engine.model.Scene getScene() {
    final com.bladecoder.engine.model.World world = com.bladecoder.engine.model.World.getInstance();
    if (((sceneId) != null) && (!(sceneId.trim().isEmpty()))) {
        return world.getScene(sceneId);
    }else {
        return world.getCurrentScene();
    }
}