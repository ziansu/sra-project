@java.lang.Override
public void onStart(android.content.Intent intent, int startId) {
    createForegroundNotification();
    if (intent != null) {
        intervalTime = intent.getLongExtra(com.kostas.service.RunningService.INTERVAL_TIME, 0);
        startCountDownForNextInterval(intervalTime);
        intervals = new java.util.ArrayList<com.kostas.dbObjects.Interval>();
        intervalDistance = intent.getFloatExtra(com.kostas.service.RunningService.INTERVAL_DISTANCE, 0);
        intervalRounds = intent.getIntExtra(com.kostas.service.RunningService.INTERVAL_ROUNDS, 0);
        new com.kostas.service.RunningService.PerformAsyncTask(0).execute();
    }
}