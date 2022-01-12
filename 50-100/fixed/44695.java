public void init() throws java.lang.Exception {
    this.mCamerasList = new java.util.ArrayList<>();
    this.mCamera = new embla3d.engine.camera.Camera();
    this.mSceneVertex = new embla3d.engine.SceneVertex();
    this.mSceneLight = new embla3d.engine.light.SceneLight();
    this.mCallback = new embla3d.engine.Callback();
    this.mItemGroupArrayList = new java.util.ArrayList<>();
    this.mSkyboxToBeRemoved = new java.util.ArrayList<>();
    this.mLoop = true;
}