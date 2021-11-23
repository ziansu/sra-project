private void processIntent() {
    android.content.Intent intent = getIntent();
    mData = intent.getData();
    mSinglePicture = ((org.bean.jandan.model.SinglePicture) (intent.getSerializableExtra(C.Extra.TAG_SINGLE_PICTURE)));
    if (((mData) == null) && ((mSinglePicture) == null)) {
        finish();
        return ;
    }
    if ((mData) == null) {
        mData = mSinglePicture.getPicUri();
    }
    mIsGif = org.bean.jandan.common.util.URLUtil.isGifUrl(mData);
}