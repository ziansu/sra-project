public void dispose() {
    Team4450.Lib.Util.consoleLog(gamePadName);
    if ((monitorGamePadThread) != null)
        monitorGamePadThread.interrupt();
    
}