@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    UPDATE_INTERVAL = intent.getIntExtra("updateInterval", 8);
    net.crowmaster.esmfamil.services.EventCheckerService.runnable = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            updateInfo();
        }
    };
    net.crowmaster.esmfamil.services.EventCheckerService.handler = new android.os.Handler();
    net.crowmaster.esmfamil.services.EventCheckerService.handler.post(net.crowmaster.esmfamil.services.EventCheckerService.runnable);
    return super.onStartCommand(intent, flags, startId);
}