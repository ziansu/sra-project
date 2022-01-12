public long getAlbumId() {
    synchronized(this) {
        try {
            if (((mCursor) == null) || (mCursor.isClosed())) {
                return -1;
            }
            return mCursor.getLong(mCursor.getColumnIndexOrThrow(AudioColumns.ALBUM_ID));
        } catch (java.lang.Throwable e) {
            com.andrew.apollo.MusicPlaybackService.LOG.error("Error using db cursor to get album id", e);
            mCursor = null;
            return -1;
        }
    }
}