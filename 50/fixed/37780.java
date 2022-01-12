@java.lang.Override
public void setPositionX(float x) {
    float deltaX = x - (getPrevPositionX());
    tiledCollisionComponent.updateBoundingBoxesPosition(deltaX, 0.0F);
    super.setPositionX(x);
}