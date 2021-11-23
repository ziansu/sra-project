@java.lang.Override
public void onResume() {
    super.onResume();
    org.opencv.android.OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION_2_4_9, this, mLoaderCallback);
}