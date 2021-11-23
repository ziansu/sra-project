@java.lang.Override
public void onOpened(boolean isSuccess) {
    if (isSuccess) {
        com.fezrestia.android.viewfinderanywhere.control.OverlayViewFinderController.getInstance().getCurrentState().onCameraReady();
    }else {
        com.fezrestia.android.viewfinderanywhere.control.OverlayViewFinderController.getInstance().getCurrentState().onCameraBusy();
    }
}