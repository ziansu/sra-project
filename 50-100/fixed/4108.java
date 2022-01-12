public boolean rotate() {
    final org.voovan.tools.hashwheeltimer.HashWheel rotateWheel = wheel;
    final org.voovan.tools.hashwheeltimer.HashWheelTimer tempTimer = this;
    timer.schedule(new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            if (org.voovan.tools.TEnv.isMainThreadShutDown()) {
                this.cancel();
            }
            rotateWheel.Tick();
            if (org.voovan.tools.TEnv.isMainThreadShutDown()) {
                tempTimer.cancel();
            }
        }
    }, 0, tickStep);
    return true;
}