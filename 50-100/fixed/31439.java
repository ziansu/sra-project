@java.lang.Override
public void call(com.etiennelawlor.hackernews.network.models.TopStory topStory) {
    if ((!(isRefreshing)) && (topStory != null)) {
        progressBar.setVisibility(View.GONE);
        topStoriesAdapter.add(topStory);
        if ((topStoriesAdapter.getItemCount()) == (storyIdCount)) {
            swipeRefreshLayout.setRefreshing(false);
            isRefreshing = false;
        }
    }
}