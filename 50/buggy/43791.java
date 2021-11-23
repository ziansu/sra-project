@java.lang.Override
protected void populateList() {
    stories = ((java.util.ArrayList<com.codepath.timeline.models.Story>) (com.codepath.timeline.util.MockResponseGenerator.getInstance().getStoryList()));
    addAll(stories);
}