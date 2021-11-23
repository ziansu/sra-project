@java.lang.Override
public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    com.badlogic.gdx.math.Vector2 target = getTarget(screenX, screenY);
    if ((target.x) < ((uk.co.redfruit.gdx.skyisfalling.utils.Constants.WORLD_WIDTH) / 2)) {
        playerShip.movingRight = false;
        playerShip.movingLeft = true;
    }else
        if ((target.x) > ((uk.co.redfruit.gdx.skyisfalling.utils.Constants.WORLD_WIDTH) / 2)) {
            playerShip.movingLeft = false;
            playerShip.movingRight = true;
        }
    
    return true;
}