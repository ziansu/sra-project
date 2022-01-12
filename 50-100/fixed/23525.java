private void waitForTime(long time) {
    if (time == 0) {
        return ;
    }
    long start = java.lang.System.currentTimeMillis();
    while (!(stop)) {
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.InterruptedException e) {
        }
        if (((java.lang.System.currentTimeMillis()) - start) >= time) {
            break;
        }
    } 
}