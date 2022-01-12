private void callbackProgressInternal(float progress) {
    if ((mListener) != null) {
        mListener.onSeekProgress(progress);
    }
}