@java.lang.Override
public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    if (button == (com.badlogic.gdx.Input.Buttons.LEFT)) {
        drawingPointer = pointer;
        int x = ((int) (pl.kotcrab.jdialogue.editor.Touch.calcX(screenX)));
        int y = ((int) (pl.kotcrab.jdialogue.editor.Touch.calcY(screenY)));
        currentRect = new com.badlogic.gdx.math.Rectangle(x, y, 0, 0);
        updateDrawableRect();
    }
    return false;
}