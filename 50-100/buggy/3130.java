private void createReminderService() {
    android.content.Intent intent = new android.content.Intent(this, ra57_2014.pnrs1.rtrk.taskmanager.main.ReminderService.class);
    intent.putExtra("Task", tasks);
    android.content.ServiceConnection mConnection = new android.content.ServiceConnection() {
        @java.lang.Override
        public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
            mReminder = ((ra57_2014.pnrs1.rtrk.taskmanager.main.ReminderService.ReminderBinder) (service)).getService();
        }

        @java.lang.Override
        public void onServiceDisconnected(android.content.ComponentName name) {
        }
    };
    bindService(intent, mConnection, ra57_2014.pnrs1.rtrk.taskmanager.main.BIND_AUTO_CREATE);
    startService(intent);
}