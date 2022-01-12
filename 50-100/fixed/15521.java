@java.lang.Override
public void onComplete(java.lang.String response) {
    super.onComplete(response);
    if (!(android.text.TextUtils.isEmpty(response))) {
        if (response.startsWith("{\"comments\"")) {
            mCommentList = mCommentList.parse(response);
            if (null != (mCommentList)) {
                mCommentsAdapter = new com.bricechou.weiboclient.adapter.CommentsAdapter(this, mCommentList.commentList);
                mPullToRefreshListView.setAdapter(mCommentsAdapter);
            }
        }
    }
}