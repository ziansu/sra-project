@java.lang.Override
@android.support.annotation.NonNull
protected net.jejer.hipda.service.Result onRunJob(net.jejer.hipda.service.Params params) {
    if (!(net.jejer.hipda.okhttp.OkHttpHelper.getInstance().isLoggedIn())) {
        net.jejer.hipda.service.NotiHelper.cancelJob();
    }else {
        net.jejer.hipda.bean.HiSettingsHelper.getInstance().setNotiJobLastRunTime();
        if ((!(net.jejer.hipda.ui.HiApplication.isAppVisible())) && (!(net.jejer.hipda.bean.HiSettingsHelper.getInstance().isInSilentMode()))) {
            checkNotifications();
        }
    }
    return Result.SUCCESS;
}