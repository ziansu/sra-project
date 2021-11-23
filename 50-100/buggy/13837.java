@java.lang.Override
public void showCommentList(java.util.List<com.yc.english.community.model.domain.CommentInfo> list) {
    if ((currentPage) > 1) {
        mCommentItemAdapter.addData(list);
    }else {
        mCommentItemAdapter.setNewData(list);
    }
    if ((list.size()) == (pageSize)) {
        (currentPage)++;
        mCommentItemAdapter.loadMoreComplete();
    }else {
        if ((currentPage) > 1) {
            mCommentItemAdapter.loadMoreEnd();
        }
    }
}