private void sleep(int time) {
    try {
        java.lang.Thread.sleep(time);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}