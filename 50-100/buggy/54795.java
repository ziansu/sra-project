private void updateTitle() {
    if ((getSupportActionBar()) != null) {
        java.lang.String titlePath = (mCurrentPath.isEmpty()) ? "/" : mCurrentPath;
        if (titlePath.startsWith(mStartPath)) {
            titlePath = titlePath.replaceFirst(mStartPath, getString(R.string.start_path_name));
        }
        if (android.text.TextUtils.isEmpty(mTitle)) {
            getSupportActionBar().setTitle(titlePath);
        }else {
            getSupportActionBar().setSubtitle(titlePath);
        }
    }
}