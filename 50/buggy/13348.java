@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mOpenCvCameraView.disableView();
    try {
        btSocket.close();
    } catch (java.io.IOException e) {
    }
}