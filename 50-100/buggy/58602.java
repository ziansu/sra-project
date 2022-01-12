public static boolean isHistoryReady(org.terracotta.management.model.stats.AbstractStatisticHistory counterHistory, long defaultValue) {
    if ((counterHistory.getValue().length) > 0) {
        int mostRecentIndex = (counterHistory.getValue().length) - 1;
        java.lang.System.out.println(("isHistoryReady: " + (counterHistory.getValue()[mostRecentIndex].getValue())));
        if (((long) (counterHistory.getValue()[mostRecentIndex].getValue())) > defaultValue) {
            return true;
        }
    }
    return false;
}