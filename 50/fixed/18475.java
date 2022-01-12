@java.lang.Override
public int getDuration() {
    if ((mDuration) > 0) {
        return mDuration;
    }
    throw new java.lang.IllegalStateException(("Invalid state: " + (mState)));
}