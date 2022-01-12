@java.lang.Override
public void getResult(com.java.a31.androidappproject.models.INewsDetail newsDetail) {
    mNewsDetail = newsDetail;
    if ((mNewsDetail) == null) {
        mView.onFailure();
    }else {
        mView.onSuccess(mNewsDetail);
        if (mNewsDetail.isFavorite()) {
            mView.setLike();
        }else {
            mView.setUnLike();
        }
    }
}