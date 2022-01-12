public static void synchronizeMotivationCsv(android.content.Context context) {
    aman.darkgoals.MotivationAlarm.DownloadCsvTask csvTask = new aman.darkgoals.MotivationAlarm.DownloadCsvTask(context);
    csvTask.execute(((aman.darkgoals.MotivationAlarm.MOTIVATION_PATH) + (aman.darkgoals.MotivationAlarm.MESSAGES_CSV)));
}