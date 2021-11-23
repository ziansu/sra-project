public void run() {
    b.highlight();
    try {
        java.lang.Thread.sleep(800);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    b.dim();
}