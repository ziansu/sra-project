@java.lang.Override
public boolean touchUp(int screenX, int screenY, int pointer, int button) {
    com.badlogic.ashley.core.Entity entity = com.zanateh.scrapship.engine.helpers.PickHelper.getSelected(engine);
    if (entity != null) {
        this.dragAndDropSystem.setSelectedPosition(new com.badlogic.gdx.math.Vector2(screenX, screenY));
        com.zanateh.scrapship.engine.helpers.PickHelper.setUnselected(entity);
        return true;
    }
    currentTouchDown = false;
    return false;
}