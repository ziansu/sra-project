@java.lang.Override
public void onCaptureDone(int requestId) {
    getCurrentState().onStillCaptureDone();
}