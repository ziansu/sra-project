public void run() {
    try {
        while (true) {
            java.lang.Thread.sleep(service.SimulationClock.clock.getInterval());
            synchronized(this) {
                if (!(suspended)) {
                    service.SimulationClock.clock.incrementClock();
                }
            }
        } 
    } catch (java.lang.InterruptedException e) {
    }
}