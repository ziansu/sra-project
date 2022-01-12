private void publish() {
    if ((mAuthor) != null) {
        mView.onUpdate(mAuthor);
        (mPage)++;
        mTotalPage = mAuthor.getMeta().getTotalPages();
    }else
        if ((mThrowable) != null) {
            mView.onError(mThrowable);
        }
    
    mAuthor = null;
    mThrowable = null;
    mView.getModel().setLoading(false);
}