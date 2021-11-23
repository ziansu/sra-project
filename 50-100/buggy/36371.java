@java.lang.Override
public void initialize(com.jme3.app.state.AppStateManager stateManager, com.jme3.app.Application application) {
    super.initialize(stateManager, application);
    mainApplication.getRootNode().attachChild(mapTerrain.getTerrain());
    mainApplication.getRootNode().attachChild(visualsNode);
    mainApplication.getRootNode().attachChild(cameraNode);
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            initializeCamera();
            initializeLights();
            updateVisuals();
        }
    }).start();
}