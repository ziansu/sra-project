@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    if ((mCameraModel) == null) {
        mCameraModel = new com.yydcdut.note.camera.model.camera.CameraModel(getApplicationContext(), holder, mCategoryId);
        mCameraModel.onCreate(this);
    }
    mCameraModel.openCamera(mCameraId, mCameraRotation);
}