private void moveAGhost(objectsPackage.Ghost g) {
    org.jbox2d.dynamics.Body body = ((org.jbox2d.dynamics.Body) (g.getNode().getUserData()));
    body.setLinearVelocity(new org.jbox2d.common.Vec2((-20.0F), 0.0F));
    g.changeDirection();
    float xpos = mainPackage.Properties.jBoxToFxPosX(body.getPosition().x);
    float ypos = mainPackage.Properties.jBoxToFxPosY(body.getPosition().y);
    g.resetLayoutX(xpos);
    g.resetLayoutY(ypos);
}