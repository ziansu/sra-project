@java.lang.Override
public void onCreate() {
    super.onCreate();
    this.mContext = this;
    if (!(com.sunhz.projectutils.DebugController.isDebug)) {
        com.sunhz.projectutils.CrashHandler.getInstance(mContext).init();
    }
}