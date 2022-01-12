@java.lang.Override
public void onComplete(java.lang.String response) {
    super.onComplete(response);
    if (!(android.text.TextUtils.isEmpty(response))) {
        if (response.startsWith("{\"comments\"")) {
            mCommentList = com.sina.weibo.sdk.openapi.models.CommentList.parse(response);
            if (null != (mCommentList.commentList)) {
                mMessageAdapter = new com.bricechou.weiboclient.adapter.MessageAdapter(mMainActivity, mCommentList.commentList);
                mListViewMessage.setAdapter(mMessageAdapter);
            }
        }else {
            onComplete(response);
        }
    }
}