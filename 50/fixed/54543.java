@java.lang.Override
public void dispose() {
    mBandPassFilter.dispose();
    mBandPassFilter = null;
    if ((mDCFilter) != null) {
        mDCFilter.dispose();
        mDCFilter = null;
    }
}