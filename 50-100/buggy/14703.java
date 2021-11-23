@java.lang.Override
public void run() {
    isDelayed = false;
    isImmortal = true;
    location[1] = 0;
    location[3] = 0;
    location[0] = xStartLocation;
    location[2] = yStartLocation;
    immortalTimer = new java.util.Timer();
    immortalTimer.schedule(new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            isImmortal = false;
            immortalTimer.cancel();
        }
    }, (1000 * (model.Player.TIME_IMMORTAL)));
}