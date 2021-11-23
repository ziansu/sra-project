@java.lang.Override
public boolean pulse(long tick) {
    if ((tick % (pulsesToWait)) == 0) {
        sendClock();
    }
    return false;
}