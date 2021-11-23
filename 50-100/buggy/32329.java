@java.lang.Override
public long getStableId() {
    if ((mStableId) == null) {
        mStableId = ((long) (getId().hashCode()));
        mStableId = ((mStableId) << 32) + ((getTimestamp()) & -1);
    }
    return mStableId.longValue();
}