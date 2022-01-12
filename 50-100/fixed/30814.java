public void sendNotification() {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.alikemal.android.quiz.NoteActivity.class);
    com.alikemal.android.quiz.NotificationCompat.Builder mBuilder = new com.alikemal.android.quiz.NotificationCompat.Builder(this);
    mBuilder.setSmallIcon(R.drawable.ic_add_on_white_24dp);
    mBuilder.setContentTitle("Yeni görev zamanı");
    mBuilder.setContentText(note.getName());
    mBuilder.build();
    android.app.NotificationManager mNotifyMgr = ((android.app.NotificationManager) (getSystemService(com.alikemal.android.quiz.NOTIFICATION_SERVICE)));
    mNotifyMgr.notify(1, mBuilder.build());
}