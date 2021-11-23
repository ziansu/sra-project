private java.lang.String getTopPackageName() {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.LOLLIPOP)) {
        return mActivityManager.getRunningTasks(1).get(0).topActivity.getPackageName();
    }else {
        pis = mActivityManager.getRunningAppProcesses();
        if ((pis) != null) {
        }else {
            for (android.app.ActivityManager.RunningAppProcessInfo pi : pis) {
                if ((pi.pkgList.length) == 1)
                    return pi.pkgList[0];
                
            }
        }
    }
    return "";
}