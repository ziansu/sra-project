public void run() {
    synchronized(this) {
        long start = java.lang.System.currentTimeMillis();
        calculatePath();
        invalidate();
        long gap = 16 - ((java.lang.System.currentTimeMillis()) - start);
        postDelayed(this, (gap < 0 ? 0 : gap));
    }
}