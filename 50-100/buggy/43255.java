private void createGORegion() {
    gORegion = new org.andengine.entity.primitive.Rectangle(((camera.getWidth()) - (120 - ((platformSprite.getWidth()) / 2))), ((camera.getHeight()) / 2), 2, camera.getHeight(), vbom);
    gOBody = org.andengine.extension.physics.box2d.PhysicsFactory.createBoxBody(arkanoidPhysicsWorld, gORegion, BodyType.StaticBody, gOFix);
    gOBody.setUserData("GameOver");
    gORegion.setVisible(false);
}