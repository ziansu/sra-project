@java.lang.Override
public boolean todayHasEvent(long startOfDay) {
    if ((dayEventMap) != null) {
        return (dayEventMap.containsKey(startOfDay)) && ((dayEventMap.get(startOfDay).size()) != 0);
    }
    return false;
}