private void lookX(float delta) {
    float rotY = (getGameObject().getTransform().getRotation().getY()) + (((getDeltaMilis()) * (-(lookSpeed))) * delta);
    getGameObject().getTransform().getRotation().setY(rotY);
}