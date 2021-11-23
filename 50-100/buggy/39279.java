private void cleanup() {
    if ((mTaskHandle) != null) {
        mTaskHandle.cancel(true);
        mTaskHandle = null;
    }
    mBuffer.clear();
    mBuffer = null;
    mFrequencyChangeListener = null;
    mListener = null;
    mMixer = null;
    mDecimationFilter.dispose();
    mDecimationFilter = null;
}