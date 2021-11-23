public static int getCell(java.util.Calendar first) {
    int diff = sla.Tracker.daysBetweenFirstPST(first);
    boolean isFirst = diff < 7;
    if (isFirst) {
        return (diff * 2) + 1;
    }else {
        return ((diff - 7) * 2) + 1;
    }
}