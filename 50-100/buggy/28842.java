private void createGameWorldObjects() {
    createWorldAxes();
    sage.scene.shape.Cylinder ground = new sage.scene.shape.Cylinder();
    ground.setCullMode(CULL_MODE.NEVER);
    ground.setRadius(100);
    ground.setSlices(20);
    ground.setSolid(true);
    ground.setColor(java.awt.Color.gray);
    ground.rotate(90, new graphicslib3D.Vector3D(1, 0, 0));
    ground.translate(50, 2.0F, 50);
    addGameWorldObject(ground);
}