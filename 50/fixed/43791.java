@java.lang.Override
protected void populateList() {
    java.util.List<com.codepath.timeline.models.Story> stories = com.codepath.timeline.util.MockResponseGenerator.getInstance().getStoryList();
    addAll(stories);
}