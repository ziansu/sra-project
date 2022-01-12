@java.lang.Override
public void runDaemon(int delayMsec, final int periodMsec, final java.lang.Runnable f) {
    final ru.mitrakov.self.rush.Handler handler = new ru.mitrakov.self.rush.Handler(thread.getLooper());
    handler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            f.run();
            handler.postDelayed(this, periodMsec);
        }
    }, delayMsec);
}