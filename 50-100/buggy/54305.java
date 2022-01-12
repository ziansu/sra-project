@java.lang.Override
public void run() {
    while (true) {
        updateRunningApp();
        if ((runningAppCount) > 0) {
            if (isTest) {
                printTaskInfo();
                printHighLevelInfo();
            }else {
                sendInfo();
            }
        }
        try {
            java.lang.Thread.sleep(reportInterval);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}