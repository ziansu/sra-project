public void changeState(java.lang.String recordingId, java.lang.String state) {
    if (state.equals(Recording.STATE_PUBLISHED)) {
        changeState(unpublishedDir, recordingId, state);
    }else
        if (state.equals(Recording.STATE_UNPUBLISHED)) {
            changeState(publishedDir, recordingId, state);
        }
    
    if (state.equals(Recording.STATE_DELETED)) {
        changeState(publishedDir, recordingId, state);
        changeState(unpublishedDir, recordingId, state);
        changeState(deletedDir, recordingId, state);
    }
}