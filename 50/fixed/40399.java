@java.lang.Override
public void handleMessage(android.os.Message message) {
    org.chromium.chromoting.TapGestureDetector detector = mDetector.get();
    if (detector != null) {
        detector.mTapCancelled = true;
        detector.mListener.onLongPress(detector.mPointerCount, detector.mInitialPoint.x, detector.mInitialPoint.y);
        detector.mInitialPoint = null;
    }
}