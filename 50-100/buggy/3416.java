public void addStoryAt(com.thebestory.android.model.Story story, int position) {
    if ((story == null) || ((story.id) == null)) {
        return ;
    }
    storiesId.add(position, story.id);
    bookmarked : com.thebestory.android.util.CacheStories.getInstance().setBookmarked(story);
    com.thebestory.android.util.CacheStories.getInstance().updateStory(story);
}