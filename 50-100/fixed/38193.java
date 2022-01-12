public void checkNotification() {
    if ((com.teamvallartas.autodue.RecyclerViewDemoActivity.adapter.getSize()) > 0) {
        com.teamvallartas.autodue.TaskModel m = com.teamvallartas.autodue.RecyclerViewDemoActivity.adapter.getItem(0);
        NotificationClass.dueTask = m.label;
        android.content.Intent intent = new android.content.Intent(this, com.teamvallartas.autodue.NotificationClass.class);
        android.app.AlarmManager manager = ((android.app.AlarmManager) (getSystemService(Activity.ALARM_SERVICE)));
        android.app.PendingIntent pendingIntent = android.app.PendingIntent.getService(this.getApplicationContext(), 0, intent, 0);
        manager.set(AlarmManager.RTC, m.end.getTime(), pendingIntent);
    }
}