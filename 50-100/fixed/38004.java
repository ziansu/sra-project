public void start() {
    java.lang.Runnable r = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            periodicProber();
        }
    };
    sessionFailureCount = 0;
    pingFailureCount = 0;
    java.lang.Thread t = new java.lang.Thread(r, name);
    t.setDaemon(true);
    t.start();
}