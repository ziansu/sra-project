private void init() {
    initTouchpad();
    Gdx.input.setInputProcessor(touchPadHelper.getStage());
    camera = new com.badlogic.gdx.graphics.OrthographicCamera(com.platform.rider.utils.GameConstants.APP_WIDTH, com.platform.rider.utils.GameConstants.APP_HEIGHT);
    viewport = new com.badlogic.gdx.utils.viewport.FitViewport(1080, 1920, camera);
    initPhysics();
    world.setContactListener(new com.platform.rider.world.WorldController.reactorContactListener());
}