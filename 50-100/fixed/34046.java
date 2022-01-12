private void init() {
    batch = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
    b2debugRenderer = new com.badlogic.gdx.physics.box2d.Box2DDebugRenderer();
    cameraGUI = new com.badlogic.gdx.graphics.OrthographicCamera(com.platform.rider.utils.GameConstants.APP_WIDTH, com.platform.rider.utils.GameConstants.APP_HEIGHT);
    viewport = new com.badlogic.gdx.utils.viewport.FitViewport(com.platform.rider.utils.GameConstants.APP_WIDTH, com.platform.rider.utils.GameConstants.APP_HEIGHT, cameraGUI);
    cameraGUI.position.set(0, 0, 0);
    cameraGUI.setToOrtho(true, viewport.getWorldWidth(), viewport.getWorldHeight());
    cameraGUI.update();
}