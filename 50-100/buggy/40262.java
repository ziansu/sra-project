@java.lang.Override
public void run() {
    while (((androidMode) == null) || ((androidMode.getSDK()) == null)) {
        try {
            java.lang.Thread.sleep(3000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
    updateSdkMenu(sdkMenu);
}