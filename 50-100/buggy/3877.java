@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (nuclei3.logs.Logs.TRACE) {
        mTrace = new nuclei3.logs.Trace();
        mTrace.onCreate(getClass());
    }
    if (savedInstanceState == null) {
        nuclei3.notifications.NotificationManager manager = nuclei3.notifications.NotificationManager.getInstance();
        if (manager != null)
            manager.dismiss(getIntent());
        
    }
}