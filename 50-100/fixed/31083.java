@java.lang.Override
public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    translateWorldToScreenCoordinates(screenX, screenY);
    if (rightScreenTouched(touchPoint.x, touchPoint.y)) {
        bunny.jump();
    }else
        if (leftScreenTouched(touchPoint.x, touchPoint.y)) {
            bunny.dodge();
        }
    
    return super.touchDown(screenX, screenY, pointer, button);
}