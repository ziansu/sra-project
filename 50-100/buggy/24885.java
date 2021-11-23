@java.lang.Override
public void onComplete(java.lang.String s) {
    com.sina.weibo.sdk.openapi.models.CommentList commentList = com.sina.weibo.sdk.openapi.models.CommentList.parse(s);
    if ((commentList != null) && ((commentList.commentList) != null)) {
        mCommentListAdapter.appendComment(commentList.commentList);
    }
    if ((commentList.commentList) == null) {
        mCommentListAdapter.setDataComplete(true);
    }
    android.util.Log.d("TAG", ("list height = " + (mCommentListView.getMeasuredHeight())));
}