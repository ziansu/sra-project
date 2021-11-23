public void startExhaustTime() {
    setCanMove(false);
    reloadtime.schedule(new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            setCanMove(true);
        }
    }, getSpeed());
}