public void create() {
    gsm = new com.haxlabs.maxhax.handlers.GameStateManager(this);
    sb = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
    mainCam = new com.badlogic.gdx.graphics.OrthographicCamera();
    mainCam.setToOrtho(false, com.haxlabs.maxhax.main.MaxHaxGame.virtual_width, com.haxlabs.maxhax.main.MaxHaxGame.virtual_height);
    hudCam = new com.badlogic.gdx.graphics.OrthographicCamera();
    hudCam.setToOrtho(false, com.haxlabs.maxhax.main.MaxHaxGame.virtual_width, com.haxlabs.maxhax.main.MaxHaxGame.virtual_height);
}