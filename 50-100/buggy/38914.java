@java.lang.Override
public void setPosition(com.badlogic.gdx.math.Vector2 position) {
    super.setPosition(position);
    float deltaX = (position.x) - (getPositionX());
    float deltaY = (position.y) - (getPositionY());
    tiledCollisionComponent.updateBoundingBoxesPosition(deltaX, deltaY);
}