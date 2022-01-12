@java.lang.Override
public void run() {
    long now = java.lang.System.currentTimeMillis();
    stats.runTime = now - (stats.startTime);
    if (((maxRunTime) > 0) && ((stats.runTime) > (maxRunTime))) {
        runnable.notifyTimeout();
        return ;
    }
    com.bryllyant.kona.util.KSystemUtil.sleep(1000L);
    watch();
}