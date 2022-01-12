@java.lang.Override
public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    translateWorldToScreenCoordinates(screenX, screenY);
    if (rightScreenTouched(touchPoint.x, touchPoint.y)) {
        bunny.jump();
        Gdx.app.log(com.andylah.runningbunny.GameStage.TAG, ": jumping = true");
    }else
        if (leftScreenTouched(touchPoint.x, touchPoint.y)) {
            bunny.dodge();
            Gdx.app.log(com.andylah.runningbunny.GameStage.TAG, ": dodge = true");
        }
    
    return super.touchDown(screenX, screenY, pointer, button);
}