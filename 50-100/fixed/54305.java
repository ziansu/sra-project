@java.lang.Override
public void run() {
    while (true) {
        try {
            updateRunningApp();
            if ((runningAppCount) > 0) {
                if (isTest) {
                    printTaskInfo();
                    printHighLevelInfo();
                }else {
                    sendInfo();
                }
            }
            java.lang.Thread.sleep(reportInterval);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        } catch (java.lang.NullPointerException e) {
        }
    } 
}