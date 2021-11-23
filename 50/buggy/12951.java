@java.lang.Override
public void touchDragged(com.badlogic.ashley.core.Entity entity, float x, float y, int pointer) {
    com.badlogic.gdx.math.Vector2 coords = getStageCoordinates();
    currentSelectedTool.itemMouseDragged(entity, coords.x, coords.y);
}