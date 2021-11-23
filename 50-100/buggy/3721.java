private void pause() {
    if (pendingPause.compareAndSet(true, false)) {
        synchronized(lock) {
            try {
                lock.wait();
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    }else {
    }
}