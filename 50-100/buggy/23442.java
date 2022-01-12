@java.lang.Override
public void onFailed() {
    mForkTask = null;
    stopForeground(true);
    getNotificationManager().notify(1, getNotification(getResources().getString(R.string.fork_task_failed), (-1)));
    android.widget.Toast.makeText(this, getResources().getString(R.string.fork_task_failed), Toast.LENGTH_SHORT).show();
}