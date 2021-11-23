@java.lang.Override
public boolean todayHasEvent(long startOfDay) {
    if ((dayEventMap) != null) {
        return dayEventMap.containsKey(startOfDay);
    }
    return false;
}