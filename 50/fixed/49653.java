@java.lang.Override
public void setSpatial(com.jme3.scene.Spatial spatial) {
    super.setSpatial(spatial);
    if (spatial != null) {
        lastSpawnPos = spatial.getWorldTranslation().clone();
    }
}