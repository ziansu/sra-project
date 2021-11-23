private void saveEndBookmarkHistory() {
    if ((current_bookmark) != null) {
        current_bookmark.setEnd((((float) (mPlayer.getCurrentPosition())) / 1000));
        current_bookmark.save();
        mWaveformView.setIsBookmarking(false);
        mWaveformView.addBookmarkHistory(current_bookmark);
    }
}