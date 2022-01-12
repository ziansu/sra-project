@java.lang.Override
protected void onResume() {
    super.onResume();
    com.example.maaus.template.org.opencv.android.OpenCVLoader.initAsync(org.opencv.android.OpenCVLoader.OPENCV_VERSION_3_3_0, this, mLoaderCallback);
    if (com.example.maaus.template.org.opencv.android.OpenCVLoader.initDebug()) {
        android.util.Log.d(com.example.maaus.template.ActivityFour.TAG, "OpenCv Loaded Successfully");
        mLoaderCallback.onManagerConnected(org.opencv.android.LoaderCallbackInterface.SUCCESS);
    }else {
        android.util.Log.d(com.example.maaus.template.ActivityFour.TAG, "OpenCV not Loaded");
        com.example.maaus.template.org.opencv.android.OpenCVLoader.initAsync(org.opencv.android.OpenCVLoader.OPENCV_VERSION_3_3_0, this, mLoaderCallback);
    }
}