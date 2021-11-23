@java.lang.Override
public void onCreate() {
    super.onCreate();
    if ((eewebApplication) == null) {
        eewebApplication = ((com.baibutao.app.waibao.yun.android.androidext.EewebApplication) (getApplication()));
    }
    currentRepeatTime = com.baibutao.app.waibao.yun.android.util.ActionConstant.TIMES;
    startSystemAlarm(((java.lang.System.currentTimeMillis()) + (com.baibutao.app.waibao.yun.android.util.ActionConstant.TIMES)), currentRepeatTime);
}