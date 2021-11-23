@java.lang.Override
public void setPositionX(float x) {
    super.setPositionX(x);
    float deltaX = x - (getPrevPositionX());
    tiledCollisionComponent.updateBoundingBoxesPosition(deltaX, 0.0F);
}