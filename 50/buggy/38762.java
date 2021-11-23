@java.lang.Override
public void onScanDone(boolean isSuccess) {
    com.fezrestia.android.viewfinderanywhere.control.OverlayViewFinderController.getInstance().getCurrentState().onScanDone(isSuccess);
}