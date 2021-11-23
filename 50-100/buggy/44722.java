private rx.Observable<retrofit2.Response<okhttp3.ResponseBody>> getObsLogout(java.lang.String referer) {
    if (((mDataManager.getKey()) != null) && ((mDataManager.getKey().length()) > 0)) {
        android.util.Log.e("setloout", ("new - " + referer));
        return mSettingService.setLogout(mCookie, referer);
    }else {
        android.util.Log.e("setloout", ("old - " + referer));
        return mSettingOldService.setLogout(mCookie, referer);
    }
}