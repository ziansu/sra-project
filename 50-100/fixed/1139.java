@java.lang.Override
public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    if (button == (Input.Buttons.RIGHT)) {
        world.touchDown(screenX, screenY);
        drawSelection = false;
    }else
        if (button == (Input.Buttons.LEFT)) {
            if (!(drawSelection))
                world.clearPopUps();
            
            drawSelection = true;
            touchX = screenX;
            touchY = (Gdx.graphics.getHeight()) - screenY;
            lastX = touchX;
            lastY = touchY;
        }
    
    return true;
}