public void stop() {
    java.lang.Boolean value = active.get();
    if (value == null ? false : value) {
        return ;
    }
    handler.removeCallbacks(runnable);
}