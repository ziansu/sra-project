protected void addAll(java.util.ArrayList<com.codepath.timeline.models.Story> newStories) {
    int curSize = adaptStories.getItemCount();
    stories.clear();
    adaptStories.notifyItemRangeRemoved(0, curSize);
    stories.addAll(newStories);
    adaptStories.notifyItemRangeInserted(curSize, newStories.size());
}