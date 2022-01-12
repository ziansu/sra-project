public static void reboot(final android.content.Context context, java.lang.String reason, boolean confirm) {
    com.android.server.power.ShutdownThread.mReboot = true;
    com.android.server.power.ShutdownThread.mRebootSafeMode = false;
    com.android.server.power.ShutdownThread.mRebootHasProgressBar = false;
    com.android.server.power.ShutdownThread.mReason = reason;
    com.android.server.power.ShutdownThread.mRebootAdvMode = false;
    com.android.server.power.ShutdownThread.shutdownInner(context, confirm);
}