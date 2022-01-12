private rx.Observable<retrofit2.Response<okhttp3.ResponseBody>> getObsLogout(java.lang.String referer) {
    if (((mDataManager.getKey()) != null) && ((mDataManager.getKey().length()) > 0)) {
        return mSettingService.setLogout(mCookie, referer);
    }else {
        return mSettingOldService.setLogout(mCookie, referer);
    }
}