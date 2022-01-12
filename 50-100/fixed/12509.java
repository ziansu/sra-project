@java.lang.Override
public void run(io.github.carlorodriguez.alarmon.NotificationServiceInterface service) {
    int count;
    try {
        count = service.firingAlarmCount();
    } catch (android.os.RemoteException e) {
        return ;
    }
    if (count > 0) {
        android.content.Intent notifyActivity = new android.content.Intent(getApplicationContext(), io.github.carlorodriguez.alarmon.ActivityAlarmNotification.class);
        notifyActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(notifyActivity);
    }
}