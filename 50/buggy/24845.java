@java.lang.Override
public void run() {
    mCallbackView.setVisibility(View.INVISIBLE);
    mCallbackView.setAlpha(0);
    btnCapture.setEnabled(true);
    io.github.data4all.logger.Log.i(io.github.data4all.activity.CameraActivity.TAG, "ending success animation");
    setLayout();
}