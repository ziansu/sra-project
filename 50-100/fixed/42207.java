private java.lang.Double getSucceededPredecessorsRatio(edu.wpi.cetask.Plan eventPlan) {
    checkSucceededPredecessors(eventPlan);
    int achievedCount = achievedPredecessorCount;
    int totalCount = totalPredecessorCount;
    achievedPredecessorCount = 0;
    totalPredecessorCount = 0;
    if (totalCount == 0)
        return null;
    
    return ((double) (achievedCount)) / totalCount;
}