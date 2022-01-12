public static void initialize(android.content.Context context, tech.gujin.toast.ToastUtil.Mode mode) {
    if (tech.gujin.toast.ToastUtil.initialized) {
        android.util.Log.w(tech.gujin.toast.ToastUtil.TAG, "Invalid initialize, ToastUtil is already initialized");
        return ;
    }
    if (context == null) {
        throw new java.lang.NullPointerException("context can not be null");
    }
    tech.gujin.toast.ToastUtil.sContext = context.getApplicationContext();
    tech.gujin.toast.ToastUtil.sDefaultMode = mode;
    tech.gujin.toast.ToastUtil.sHandler = new tech.gujin.toast.ToastUtilHandler(android.os.Looper.getMainLooper());
    tech.gujin.toast.ToastUtil.initialized = true;
}