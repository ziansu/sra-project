public static void main(java.lang.String[] args) {
    java.lang.String dataDir = java.lang.System.getenv("DATA_DIR");
    java.lang.String feedBackUrl = java.lang.System.getenv("FEEDBACK_URL");
    if (android.text.TextUtils.isEmpty(dataDir)) {
        android.util.Log.e("DaemonThread", "DATA_DIR is empty, DaemonThread exit.");
        return ;
    }
    if (android.text.TextUtils.isEmpty(feedBackUrl)) {
        android.util.Log.e("DaemonThread", "FEEDBACK_URL is empty, DaemonThread exit.");
        return ;
    }
    cn.hiroz.uninstallfeedback.FeedbackUtils.syncOpenUrlWhenUninstall(dataDir, feedBackUrl);
}