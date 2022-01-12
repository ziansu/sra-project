@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.e("ServiceUP", "同步服务启动成功");
    java.util.TimerTask timerTask = new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            android.util.Log.e("TestSync", "同步成功啦");
            checkTime();
            syncChannel();
            syncReminder();
        }
    };
    timer = new java.util.Timer();
    timer.schedule(timerTask, (1000 * 10), (1000 * 1000));
    return START_STICKY;
}