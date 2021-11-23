@java.lang.Override
public synchronized void timeIncrease() {
    if ((time.getRunningTime()) == 0) {
        time.setRunningTime(UIUpdateListener.updateTime(time.getRunningTime(), this.state.equals(stoppedState)));
    }
    if ((time.getRunningTime()) >= 99) {
        toRunningState();
    }else {
        timStop();
        time.incRuntime();
        actionUpdateView();
        timStart();
    }
}