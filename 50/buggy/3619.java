@java.lang.Override
public void onTimeChanged() {
    if (enableRefresh) {
        refresh();
        updateClockColor();
        updateClockDateColor();
    }
}