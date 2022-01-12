private static com.ziftr.android.ziftrwallet.util.ZLog initLogger() {
    if (com.ziftr.android.ziftrwallet.ZWApplication.isDebuggable()) {
        return new com.ziftr.android.ziftrwallet.util.ZLog.AndroidLogger();
    }
    return new com.ziftr.android.ziftrwallet.util.ZLog.NoOpLogger();
}