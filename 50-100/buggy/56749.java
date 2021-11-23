public void addGhostControl() {
    com.jme3.bullet.control.GhostControl newSgc = new com.jme3.bullet.control.GhostControl();
    maud.view.SceneView sceneView = cgm.getSceneView();
    com.jme3.scene.Spatial viewSpatial = sceneView.selectedSpatial();
    com.jme3.bullet.collision.shapes.CollisionShape shape = maud.PhysicsUtil.makeShape(viewSpatial);
    newSgc.setCollisionShape(shape);
    editableCgm.addSgc(newSgc);
    editableCgm.getSgc().select(newSgc);
}