void setCgmRoot(com.jme3.scene.Spatial newRoot) {
    if (newRoot == null) {
        cgModelRoot = null;
    }else {
        cgModelRoot = newRoot.clone();
    }
}