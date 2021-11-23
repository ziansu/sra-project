@java.lang.Override
public void onStart(android.content.Intent intent, int startId) {
    android.widget.Toast.makeText(this, "Wifi Service Started", Toast.LENGTH_LONG).show();
    myTimer = new java.util.Timer();
    myTimer.schedule(new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            TimerMethod();
        }
    }, 0, 20000);
}