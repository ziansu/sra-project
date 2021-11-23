public void run() {
    while (true) {
        long cur = java.lang.System.currentTimeMillis();
        for (org.randac.tick.Tick tick : this) {
            if ((cur - (tick.last)) >= (tick.interval)) {
                tick.execute();
                tick.last = cur;
                try {
                    java.lang.Thread.sleep(50);
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    } 
}