@java.lang.Override
public void run() {
    tank.updateLevel();
    if (!(mode.equals(no.kreutzer.water.Controller.Mode.OFF))) {
        checkLevel();
    }
    updateStatus();
    if ((tank.getState()) == (Tank.State.FILLING)) {
        scheduledPool.schedule(runnableTask, no.kreutzer.water.Controller.FILL_INTERVAL, java.util.concurrent.TimeUnit.SECONDS);
    }else {
        scheduledPool.schedule(runnableTask, no.kreutzer.water.Controller.FULL_INTERVAL, java.util.concurrent.TimeUnit.SECONDS);
    }
}