@java.lang.Override
public void onManagerConnected() {
    android.util.Log.i(com.rayboot.scanner.ScanCorpActivity.TAG, "OpenCV loaded successfully");
    java.io.File file = new java.io.File(mContentImagePath);
    if (file.exists()) {
        mOpenCVManager.findBrim(mContentImagePath);
        showProgressDialog(getString(R.string.scan_dialog_title), getString(R.string.scan_dialog_msg));
    }
}