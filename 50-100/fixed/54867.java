@java.lang.Override
public void updateGeometricState() {
    if (!(children.isEmpty())) {
        for (com.jme3.scene.BatchNode.Batch batch : batches.getArray()) {
            if (batch.needMeshUpdate) {
                batch.geometry.updateModelBound();
                batch.geometry.updateWorldBound();
                batch.needMeshUpdate = false;
            }
        }
    }
    super.updateGeometricState();
}