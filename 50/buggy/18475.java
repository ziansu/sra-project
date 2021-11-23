@java.lang.Override
public int getDuration() {
    if (((mState) == (PLAYER_STATE.IDLE)) || ((mState) == (PLAYER_STATE.END))) {
        throw new java.lang.IllegalStateException(("Invalid state: " + (mState)));
    }
    return mDuration;
}