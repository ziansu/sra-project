public java.util.ArrayList<ntut.csie.ezScrum.web.dataObject.StoryObject> getDroppedStories() {
    if ((mDropedStories) == null) {
        mDropedStories = ntut.csie.ezScrum.web.dataObject.StoryObject.getStoriesWithNoParent(mProject.getId());
    }
    return mDropedStories;
}