public java.util.ArrayList<ntut.csie.ezScrum.web.dataObject.StoryObject> getDroppedStories() {
    mDropedStories = ntut.csie.ezScrum.web.dataObject.StoryObject.getStoriesWithNoParent(mProject.getId());
    return mDropedStories;
}