public void start() {
    java.lang.System.out.println(("Starting " + (threadName)));
    if ((t) == null) {
        t = new java.lang.Thread(this, threadName);
        t.start();
    }
}