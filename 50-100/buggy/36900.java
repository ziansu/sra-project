private void loadModel(java.lang.String path, com.jme3.test.Vector3f offset, float scale) {
    com.jme3.scene.Spatial s = assetManager.loadModel(path);
    s.scale(scale);
    s.move(offset);
    assets.add(s);
    if (playAnim) {
        playFirstAnim(s);
    }
    com.jme3.animation.SkeletonControl ctrl = findSkeletonControl(s);
    if (ctrl == null) {
        return ;
    }
    getStateManager().getState(com.jme3.scene.debug.custom.SkeletonDebugAppState.class).addSkeleton(ctrl, true);
}