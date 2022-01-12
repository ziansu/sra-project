public static boolean isHistoryReady(org.terracotta.management.model.stats.AbstractStatisticHistory counterHistory, java.lang.Long defaultValue) {
    if ((counterHistory.getValue().length) > 0) {
        int mostRecentIndex = (counterHistory.getValue().length) - 1;
        if (((java.lang.Long) (counterHistory.getValue()[mostRecentIndex].getValue())) > defaultValue) {
            return true;
        }
    }
    return false;
}