@java.lang.Override
protected void runAsync(java.lang.Runnable runnable) {
    thread = new java.lang.Thread(runnable);
}