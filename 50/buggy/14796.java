@java.lang.Override
public void onStop() {
    super.onStop();
    if ((mCamera) != null) {
        mCamera.release();
    }
}