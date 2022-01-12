public void addGhostControl() {
    maud.view.SceneView sceneView = cgm.getSceneView();
    com.jme3.scene.Spatial viewSpatial = sceneView.selectedSpatial();
    com.jme3.bullet.collision.shapes.CollisionShape shape = maud.PhysicsUtil.makeShape(viewSpatial);
    com.jme3.bullet.control.GhostControl newSgc = new com.jme3.bullet.control.GhostControl(shape);
    editableCgm.addSgc(newSgc);
    editableCgm.getSgc().select(newSgc);
}