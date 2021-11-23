public void resume() {
    if (stopped) {
        synchronized(this) {
            stopped = false;
            notify();
        }
    }
}