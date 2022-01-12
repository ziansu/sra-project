public void onBaseDataSuccess(java.util.List<com.floatingmuseum.mocloud.data.entity.Comment> comments) {
    if ((comments.size()) < (presenter.getLimit())) {
        alreadyGetAllData = true;
    }
    if (shouldClean) {
        commentsData.clear();
    }
    commentsData.addAll(comments);
    com.orhanobut.logger.Logger.d(((("评论数量：" + (commentsData.size())) + "...单次请求评论数量：") + (comments.size())));
    adapter.notifyDataSetChanged();
    shouldClean = true;
}