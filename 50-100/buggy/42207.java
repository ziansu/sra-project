private double getSucceededPredecessorsRatio(edu.wpi.cetask.Plan eventPlan) {
    checkSucceededPredecessors(eventPlan);
    int achievedCount = achievedPredecessorCount;
    int totalCount = totalPredecessorCount;
    achievedPredecessorCount = 0;
    totalPredecessorCount = 0;
    return ((double) (achievedCount)) / (totalCount != 0 ? totalCount : 1);
}