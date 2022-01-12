private void lookY(float delta) {
    float rotX = (getGameObject().getTransform().getRotation().getX()) + ((lookSpeed) * delta);
    if (rotX < (xRangeMin))
        rotX = xRangeMin;
    
    if (rotX > (xRangeMax))
        rotX = xRangeMax;
    
    getGameObject().getTransform().getRotation().setX(rotX);
}