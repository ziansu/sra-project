private void addHistoryOfTaskRemoveFromStory(long storyId, long taskId, long specificTime) {
    addHistory(HistoryObject.TYPE_REMOVE, "", java.lang.String.valueOf(storyId), specificTime);
}