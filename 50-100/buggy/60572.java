@java.lang.Override
public void render() {
    accumulator += Gdx.graphics.getDeltaTime();
    while ((accumulator) > (step)) {
        accumulator -= step;
        RavTech.ui.getStage().act(step);
    } 
    RavTech.sceneHandler.render();
    RavTech.ui.getStage().draw();
    RavTech.shapeRenderer.begin();
    RavTech.shapeRenderer.circle(RavTech.input.getWorldPosition().x, RavTech.input.getWorldPosition().y, 2);
    RavTech.shapeRenderer.end();
}