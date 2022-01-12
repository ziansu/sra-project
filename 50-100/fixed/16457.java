public void run() {
    try {
        while (true) {
            java.lang.Thread.sleep(this.getInterval());
            synchronized(this) {
                if (!(suspended)) {
                    this.incrementClock();
                }
            }
        } 
    } catch (java.lang.InterruptedException e) {
    }
}