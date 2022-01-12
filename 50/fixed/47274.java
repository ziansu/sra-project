@java.lang.Override
public void finish() {
    super.finish();
    setMode(com.example.try_gameengine.scene.Scene.FINISHED);
    gameModel.setData(new com.example.try_gameengine.scene.Scene.DestoryData());
    com.example.try_gameengine.framework.LayerManager.deleteSceneLayersByLayerLevel(sceneLayerLevel);
}