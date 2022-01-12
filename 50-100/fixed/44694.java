private void loadName() {
    if (((mAppName) == null) || (!(mMounted))) {
        if (((mApkFile) != null) && (!(mApkFile.exists()))) {
            mMounted = false;
            mAppName = mAppInfo.packageName;
        }else
            if ((mAppInfo) != null) {
                mMounted = true;
                java.lang.CharSequence label = mAppInfo.loadLabel(mPm);
                mAppName = (label != null) ? label.toString() : mAppInfo.packageName;
            }
        
    }
}