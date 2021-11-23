public void run() {
    Team4450.Robot9.Util.consoleLog();
    try {
        Team4450.Robot9.Util.consoleLog();
        BeltIn();
        java.lang.Thread.sleep(1000);
        teleop.lightOff();
        BeltOff();
    } catch (java.lang.InterruptedException e) {
    } catch (java.lang.Throwable e) {
        e.printStackTrace(Util.logPrintStream);
    }
    BeltOff();
}