private void startRunner() {
    runRunner = true;
    if ((runner) == null) {
        runner = new java.lang.Thread() {
            public void run() {
                while (((runner) != null) && (runRunner)) {
                    try {
                        java.lang.Thread.sleep(250);
                    } catch (java.lang.InterruptedException e) {
                    }
                    mHandler.post(updater);
                } 
            }
        };
        runner.start();
    }
}