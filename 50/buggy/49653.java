@java.lang.Override
public void setSpatial(com.jme3.scene.Spatial spatial) {
    super.setSpatial(spatial);
    lastSpawnPos = spatial.getWorldTranslation().clone();
}