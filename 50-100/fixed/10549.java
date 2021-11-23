private boolean refreshUser() {
    mUser = mSession.getDataHandler().getStore().getUser(mMemberId);
    if (null == (mUser)) {
        mUser = new org.matrix.androidsdk.rest.model.User();
        mUser.user_id = mMemberId;
        mUser.displayname = getIntent().getStringExtra(im.vector.activity.VectorMemberDetailsActivity.EXTRA_MEMBER_DISPLAY_NAME);
        if (android.text.TextUtils.isEmpty(mUser.displayname)) {
            mUser.displayname = mMemberId;
        }
        mUser.avatar_url = getIntent().getStringExtra(im.vector.activity.VectorMemberDetailsActivity.EXTRA_MEMBER_AVATAR_URL);
        return true;
    }
    return false;
}