private void publish() {
    mView.getModel().setLoading(false);
    if ((mAuthor) != null) {
        (mPage)++;
        mTotalPage = mAuthor.getMeta().getTotalPages();
        mView.onUpdate(mAuthor);
    }else
        if ((mThrowable) != null) {
            mView.onError(mThrowable);
        }
    
    mAuthor = null;
    mThrowable = null;
}