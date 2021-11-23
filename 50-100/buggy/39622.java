@java.lang.Override
public void act(float delta) {
    fr.imac.myrddin.game.GameScreen.physicWorld.step(Gdx.graphics.getDeltaTime(), 6, 2);
    super.act(delta);
    if (myrddin.respawn())
        instantLoad();
    
    if ((Gdx.input.isKeyPressed(Input.Keys.CONTROL_LEFT)) && (Gdx.input.isKeyPressed(Input.Keys.S)))
        instantSave();
    
    updateCamera();
    hud.setPosition(((getCamera().position.x) - (0.5F * (fr.imac.myrddin.MyrddinGame.WIDTH))), 0);
}