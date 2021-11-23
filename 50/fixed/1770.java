@java.lang.Override
public void simpleInitApp() {
    appManager = new cinema.AppManager();
    appManager.setScenePath(scenePath);
    stateManager.attach(appManager);
    getFlyByCamera().setMoveSpeed(5);
}