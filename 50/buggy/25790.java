public void initializerTimer() {
    this.timer = new java.util.Timer();
    this.task = new java.util.TimerTask() {
        public void run() {
            move();
        }
    };
}