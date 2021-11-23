@java.lang.Override
public void onSuccess() {
    if (shouldReresh) {
        refreshList(liveStoryItemIds);
    }else {
        loadMore();
    }
}