@java.lang.Override
public void runDaemon(int delayMsec, final int periodMsec, final java.lang.Runnable f) {
    handler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            f.run();
            handler.postDelayed(this, periodMsec);
        }
    }, delayMsec);
}