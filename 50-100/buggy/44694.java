private void loadName() {
    if (((mAppName) == null) || (!(mMounted))) {
        if (!(mApkFile.exists())) {
            mMounted = false;
            mAppName = mAppInfo.packageName;
        }else {
            mMounted = true;
            java.lang.CharSequence label = mAppInfo.loadLabel(mPm);
            mAppName = (label != null) ? label.toString() : mAppInfo.packageName;
        }
    }
}