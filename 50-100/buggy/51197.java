private void applyPeriod(int period) {
    if (period > 0) {
        if ((future) != null) {
            future.cancel(true);
        }
        while (!(future.isCancelled())) {
        } 
        submitTask(period);
    }
}