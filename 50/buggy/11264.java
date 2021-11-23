public void init() {
    if ((!(isInit)) && (com.rayboot.scantool.cv.org.opencv.android.OpenCVLoader.initDebug())) {
        mLoaderCallback.onManagerConnected(org.opencv.android.LoaderCallbackInterface.SUCCESS);
        isInit = true;
    }
}