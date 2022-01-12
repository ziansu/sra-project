public void stop() {
    if (running) {
        running = false;
        while (mThread.isAlive()) {
            try {
                java.lang.Thread.sleep(1);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }
}