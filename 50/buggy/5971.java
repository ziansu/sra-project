public void batch() {
    doBatch();
    for (com.jme3.scene.BatchNode.Batch batch : batches.getArray()) {
        batch.geometry.setIgnoreTransform(true);
        batch.geometry.setUserData(UserData.JME_PHYSICSIGNORE, true);
    }
    updateGeometricState();
}