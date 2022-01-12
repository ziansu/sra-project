@java.lang.Override
public void render() {
    accumulator += Gdx.graphics.getDeltaTime();
    while ((accumulator) > (step)) {
        accumulator -= step;
        RavTech.ui.getStage().act(step);
    } 
    RavTech.sceneHandler.render();
    RavTech.ui.getStage().draw();
}