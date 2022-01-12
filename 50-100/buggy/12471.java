private void checkSimultaneousRelease() {
    final int timeSensitiveness = 50;
    if (((keyThread) != null) && ((keyThread.getState()) == (java.lang.Thread.State.TIMED_WAITING))) {
        updateMovement();
    }else {
        keyThread = new java.lang.Thread() {
            public void run() {
                try {
                    keyThread.sleep(timeSensitiveness);
                    updateMovement();
                } catch (java.lang.InterruptedException e) {
                    java.lang.System.out.println(("------ Key thread interrupted -------\n" + e));
                }
            }
        };
        keyThread.start();
    }
}