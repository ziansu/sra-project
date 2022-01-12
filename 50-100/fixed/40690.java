public void refreshNotify() {
    if (!(mStartSuccess)) {
        stopEngine();
        try {
            java.lang.Thread.sleep(200);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        boolean ret = startEngine();
        if (ret) {
            mStartSuccess = true;
        }
    }
}