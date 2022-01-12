@java.lang.Override
public void onHeadHit() {
    Gdx.app.log("Coin", "Collision");
    if ((getCell().getTile().getId()) == (BLANK_COIN))
        MarioBros.manager.get("audio/sounds/bump.wav", com.badlogic.gdx.audio.Sound.class).play();
    else
        MarioBros.manager.get("audio/sounds/coin.wav", com.badlogic.gdx.audio.Sound.class).play();
    
    getCell().setTile(com.mkemp.mariobros.Sprites.Coin.tileSet.getTile(BLANK_COIN));
    com.mkemp.mariobros.Scenes.Hud.addScore(100);
}