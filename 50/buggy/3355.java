private void addHistoryOfTaskRemoveFromStory(long storyId, long taskId) {
    addHistory(HistoryObject.TYPE_REMOVE, "", java.lang.String.valueOf(mStoryId));
}