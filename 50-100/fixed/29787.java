public double calculateCurrentGoal() {
    int weekDifference = (currentWeek) - (currentWeekGoal);
    double slope = ((double) ((goalUnit) - (startUnit))) / (((double) (duration)) - weekDifference);
    return ((double) (((this.currentWeekGoal) * slope) + (startUnit)));
}