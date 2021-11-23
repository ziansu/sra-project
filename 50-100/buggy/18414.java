@butterknife.OnClick(value = R.id.nav_user)
void onUserClick() {
    if ((mUser) == null) {
        mContext.toLoginPage();
    }else {
        android.content.Intent intent = new android.content.Intent(mContext, com.ladjzero.uzlee.ActivityUser.class);
        intent.putExtra("uid", mUser.getId());
        startActivity(intent);
    }
}