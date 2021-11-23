@java.lang.Override
public void create() {
    engine = new com.badlogic.ashley.core.PooledEngine();
    tweenManager = new aurelienribon.tweenengine.TweenManager();
    batch = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
    entityGenerator = com.kmcoding.SproxWorld.ECS.Entities.EntityGenerator.getInstanceWithGame(this);
    world = new com.badlogic.gdx.physics.box2d.World(Constants.BOX2D_GRAVITY, true);
    if (Constants.GAME_SHOW_SPLASH_SCREEN) {
        setScreen(new com.kmcoding.SproxWorld.Screens.SplashScreen(this));
    }else {
        setScreen(new com.kmcoding.SproxWorld.Screens.GameScreen(this));
    }
    setScreen(new com.kmcoding.SproxWorld.Screens.GameScreen(this));
}