private void startThread(int i, java.lang.String name, java.lang.Runnable worker) {
    java.lang.Thread thread = new java.lang.Thread(worker);
    thread.setName(java.lang.String.format("Thread %d: %s", i, name));
    thread.start();
}