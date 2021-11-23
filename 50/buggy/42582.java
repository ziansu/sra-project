@java.lang.Override
public void updateFeedData(me.abrahanfer.geniusfeed.models.Feed newFeed) {
    mFeedList.add(newFeed);
    mFeedListView.getAdapter().notifyDataSetChanged();
    getFeedFromAPI();
}