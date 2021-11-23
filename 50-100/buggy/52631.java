@java.lang.Override
public void unsubscribe(com.truethat.android.empathy.ReactionDetectionListener reactionDetectionListener) {
    if (isDetecting()) {
        android.util.Log.v(TAG, (((("Unsubscribing " + (reactionDetectionListener.getClass().getSimpleName())) + "(") + (reactionDetectionListener.hashCode())) + ")"));
        mReactionDetectionListeners.remove(reactionDetectionListener);
        android.util.Log.v(TAG, ((mReactionDetectionListeners.size()) + " listeners left."));
    }
}