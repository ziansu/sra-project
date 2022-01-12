private boolean notifyMediaSelected(int position, boolean selected) {
    org.wordpress.mediapicker.MediaItem mediaItem = mAdapter.getItem(position);
    if (mediaItem != null) {
        org.wordpress.mediapicker.source.MediaSource mediaSource = mAdapter.sourceAtPosition(position);
        if ((mediaSource == null) || (!(mediaSource.onMediaItemSelected(mediaItem, selected)))) {
            if ((mListener) != null) {
                mListener.onMediaSelected(mediaItem, selected);
            }
            mSelectedContent.add(mediaItem);
            return false;
        }
    }
    return true;
}