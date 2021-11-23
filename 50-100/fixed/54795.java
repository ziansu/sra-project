private void updateTitle() {
    if ((getSupportActionBar()) != null) {
        java.lang.String titlePath = (mCurrentPath.isEmpty()) ? "/" : mCurrentPath;
        if (android.text.TextUtils.isEmpty(mTitle)) {
            getSupportActionBar().setTitle(titlePath);
        }else {
            getSupportActionBar().setSubtitle(titlePath);
        }
    }
}