@java.lang.Override
public void onClick(android.view.View view) {
    if (mFlashOn) {
        runArtificialFlash();
        final android.os.Handler handler = new android.os.Handler();
        final java.lang.Runnable r = new java.lang.Runnable() {
            public void run() {
                mCamera.takePicture(mShutterCallback, mRawCallback, null, mJPEGCallback);
            }
        };
        handler.postDelayed(r, 800);
    }else {
        mCamera.takePicture(mShutterCallback, mRawCallback, null, mJPEGCallback);
    }
}