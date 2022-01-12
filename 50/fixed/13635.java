private void startRegisterEventProcessing() {
    synchronized(lock) {
        while ((getEventsCountProcessing) > 0) {
            try {
                lock.wait();
            } catch (java.lang.InterruptedException e) {
            }
        } 
        ++(registerEventProcessing);
    }
}