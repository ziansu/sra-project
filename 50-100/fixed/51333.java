public static se.kth.tablespoon.client.events.Comparator getFilteredComparator(se.kth.tablespoon.client.events.Threshold highThreshold, se.kth.tablespoon.client.events.Threshold lowThreshold) {
    if ((highThreshold != null) && (lowThreshold != null)) {
        if ((Comparator.GREATER_THAN_OR_EQUAL.equals(se.kth.honeytap.scaling.monitoring.MonitoringUtil.getNormalizedComparatorType(lowThreshold.comparator))) && (Comparator.LESS_THAN_OR_EQUAL.equals(se.kth.honeytap.scaling.monitoring.MonitoringUtil.getNormalizedComparatorType(highThreshold.comparator)))) {
            return lowThreshold.comparator;
        }
    }else
        if (highThreshold != null) {
            return highThreshold.comparator;
        }else
            if (lowThreshold != null) {
                return lowThreshold.comparator;
            }
        
    
    throw new java.lang.IllegalArgumentException("Could not finalize the comparator. Both thresholds are null");
}