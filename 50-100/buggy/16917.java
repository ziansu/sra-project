@java.lang.Override
public boolean touchDown(com.badlogic.ashley.core.Entity entity, float x, float y, int pointer, int button) {
    super.touchDown(entity, x, y, pointer, button);
    switch (button) {
        case Input.Buttons.MIDDLE :
            toolHotSwap(sandboxTools.get(PanTool.NAME));
            break;
    }
    com.badlogic.gdx.math.Vector2 coords = getStageCoordinates();
    return currentSelectedTool.itemMouseDown(entity, coords.x, coords.y);
}