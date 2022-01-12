@java.lang.Override
public void onScanDone(boolean isSuccess) {
    getCurrentState().onScanDone(isSuccess);
}