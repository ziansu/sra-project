@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
    android.util.Log.d(TAG, ("onSingleTapConfirmed: " + (motionEvent.toString())));
    showCallout(motionEvent);
    return true;
}