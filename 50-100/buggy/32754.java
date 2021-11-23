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
    android.util.Log.d(com.java.a31.androidappproject.news.NewsDetail.NewsDetailPresenter.TAG, ("" + (newsDetail.getImages().size())));
}