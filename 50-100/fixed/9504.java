@java.lang.Override
protected org.andengine.entity.scene.Scene onCreateScene() {
    mScene = new org.andengine.entity.scene.Scene();
    mBackground = new org.andengine.entity.scene.background.Background(0, 0, 0, 1);
    mScene.setBackground(mBackground);
    mBackground = new org.andengine.entity.scene.background.Background(0, 0, 0, 1);
    mScene.setBackground(mBackground);
    return mScene;
}