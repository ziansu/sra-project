@java.lang.Override
public void onCaptureDone(int requestId) {
    com.fezrestia.android.viewfinderanywhere.control.OverlayViewFinderController.getInstance().getCurrentState().onStillCaptureDone();
}