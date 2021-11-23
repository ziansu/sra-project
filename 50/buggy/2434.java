@java.lang.Override
public void onDestroy() {
    if (isFinished)
        return ;
    
    mCameraPreview.releaseCamera();
    super.onDestroy();
}