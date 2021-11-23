public void resume() {
    if (stopped) {
        synchronized(this) {
            if (stopped) {
                stopped = false;
                notify();
            }
        }
    }
}