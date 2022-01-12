@java.lang.Override
public void onOpened(boolean isSuccess) {
    if (isSuccess) {
        getCurrentState().onCameraReady();
    }else {
        getCurrentState().onCameraBusy();
    }
}