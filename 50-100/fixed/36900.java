private void loadModel(java.lang.String path, com.jme3.test.Vector3f offset, float scale) {
    com.jme3.scene.Spatial s = assetManager.loadModel(path);
    s.scale(scale);
    s.move(offset);
    assets.add(s);
    if (playAnim) {
        playFirstAnim(s);
    }
}