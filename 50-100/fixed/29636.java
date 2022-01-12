@java.lang.Override
public void run() {
    bridge.enterBridge(this.name);
    try {
        java.lang.Thread.sleep(500);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    bridge.leaveBridge(this.name);
    if ((number) == ((bridge.carSize) - 1)) {
        Log.outPutAllMsg();
    }
}