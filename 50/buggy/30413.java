public void update(float delta) {
    if (!(logicPaused))
        debugInput();
    
    gameCamera.update();
    viewport.apply();
    engine.update(delta);
}