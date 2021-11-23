@java.lang.Override
public void onStartedWakingUp() {
    setEnableMarquee(true);
    enableRefresh = true;
    refresh();
    updateClockColor();
    updateClockDateColor();
}