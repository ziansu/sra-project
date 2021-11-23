public void run() {
    while (true) {
        uiCallback.sendEmptyMessage(0);
        try {
            java.lang.Thread.sleep(5000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}