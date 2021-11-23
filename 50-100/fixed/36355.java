public void onBaseDataSuccess(java.util.List<com.floatingmuseum.mocloud.data.entity.Comment> comments) {
    if ((comments.size()) < (presenter.getLimit())) {
        alreadyGetAllData = true;
    }
    if (shouldClean) {
        commentsData.clear();
    }
    commentsData.addAll(comments);
    adapter.notifyDataSetChanged();
    shouldClean = true;
}