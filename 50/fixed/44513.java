@java.lang.Override
public void onSuccess(java.util.List<java.lang.Long> liveStoryItemIds) {
    com.hn.nishant.nvhn.dao.StoryToFetchDao.add(liveStoryItemIds);
    if (shouldReresh) {
        refreshList(liveStoryItemIds);
    }else {
        loadMore();
    }
}