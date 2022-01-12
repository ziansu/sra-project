@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if (isFinished)
        return ;
    
    mCameraPreview.releaseCamera();
}