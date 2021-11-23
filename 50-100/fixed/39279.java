private void cleanup() {
    if ((mTaskHandle) != null) {
        mTaskHandle.cancel(true);
        mTaskHandle = null;
    }
    synchronized(mBuffer) {
        mBuffer.clear();
        mBuffer = null;
    }
    mFrequencyChangeListener = null;
    mListener = null;
    mMixer = null;
    mDecimationFilter.dispose();
    mDecimationFilter = null;
}