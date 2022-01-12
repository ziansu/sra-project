public void addStoryAt(com.thebestory.android.model.Story story, int position) {
    if ((story == null) || ((story.id) == null)) {
        return ;
    }
    storiesId.add(position, story.id);
    if (bookmarked) {
        com.thebestory.android.util.CacheStories.getInstance().setBookmarked(story);
    }else {
        com.thebestory.android.util.CacheStories.getInstance().updateStory(story);
    }
}