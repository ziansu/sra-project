public com.jme3.scene.Spatial selectedSpatial() {
    com.jme3.scene.Spatial result = cgm.spatial.underRoot(cgmRoot);
    assert result != null;
    return result;
}