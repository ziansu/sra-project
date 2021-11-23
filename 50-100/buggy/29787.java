public double calculateCurrentGoal() {
    if ((startUnit) == (goalUnit)) {
        return startUnit;
    }else {
        int weekDifference = (currentWeek) - (currentWeekGoal);
        double slope = ((double) (goalUnit)) / (((double) (duration)) - weekDifference);
        return ((double) (((this.currentWeekGoal) * slope) + (startUnit)));
    }
}