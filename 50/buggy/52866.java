public void run() {
    button1[i].highlight();
    try {
        java.lang.Thread.sleep(800);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    button1[i].dim();
}