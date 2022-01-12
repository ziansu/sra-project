private void pause() {
    synchronized(lock) {
        if (pendingPause.compareAndSet(true, false)) {
            try {
                lock.wait();
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }else {
        }
    }
}