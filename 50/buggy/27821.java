public void updateWorldModelMatrix() {
    org.meganekkovr.Entity parent = getParent();
    if (parent != null) {
        org.joml.Matrix4f parentMatrix = parent.getWorldModelMatrix();
        parentMatrix.mul(localMatrix, worldModelMatrix);
    }
}