@java.lang.Override
public void run() {
    com.android.email.service.EmailServiceUtils.startRemoteServices(mContext);
    com.android.email.DebugUtils.updateLoggingFlags(mContext);
}