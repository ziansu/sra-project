@java.lang.Override
public long getTime() {
    if (!(finished)) {
        return ((java.lang.System.currentTimeMillis()) - (startTime)) - (countdown);
    }
    return time;
}