@java.lang.Override
public void create() {
    totalDelta = 0;
    delta = 0;
    width = Gdx.graphics.getWidth();
    height = Gdx.graphics.getHeight();
    batch = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
    camera = new com.badlogic.gdx.graphics.OrthographicCamera();
    viewport = new com.badlogic.gdx.utils.viewport.ScalingViewport(com.badlogic.gdx.utils.Scaling.stretch, 0, 0, camera);
    stage = new com.badlogic.gdx.scenes.scene2d.Stage(viewport, batch);
    welcome = new eNTeR_studio.blackandwhiteforest.state.ScreenWelcome(this);
    main = new eNTeR_studio.blackandwhiteforest.state.ScreenMain(this);
    this.setScreen(welcome);
}