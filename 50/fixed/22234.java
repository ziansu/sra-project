private void onThreadWait() {
    try {
        synchronized(this) {
            this.wait();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}