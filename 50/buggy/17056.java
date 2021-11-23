@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    (io.github.data4all.activity.AbstractActivity.counter)--;
    if ((io.github.data4all.activity.AbstractActivity.counter) == 0) {
        notificationManager.cancel(io.github.data4all.activity.AbstractActivity.NOTIFICATION_EX);
    }
}