@java.lang.Override
public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    if (button == 0) {
        xLine1 = screenX;
        yLine1 = screenY;
        mousePosX = screenX;
        mousePosY = screenY;
        drawingLine = true;
    }else
        if (button == 1) {
            xRect1 = screenX - ((Gdx.graphics.getWidth()) / 2.0F);
            yRect1 = (Gdx.graphics.getHeight()) - screenY;
            mousePosX = screenX;
            mousePosY = screenY;
            drawingRect = true;
        }
    
    return true;
}