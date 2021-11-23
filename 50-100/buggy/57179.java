public int getCount() {
    if ((mCollectionCursor) != null) {
        return mCollectionCursor.size();
    }else
        if ((mPlaylist) != null) {
            return mPlaylist.size();
        }else
            if ((mPlaybackManager) != null) {
                return (mPlaybackManager.getPlaybackListSize()) - (java.lang.Math.max(1, ((mPlaybackManager.getCurrentIndex()) + 1)));
            }else {
                return mListItems.size();
            }
        
    
}