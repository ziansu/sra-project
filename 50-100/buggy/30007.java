public workerLogic.WorkWeek getXweek(int index) {
    try {
        return getWorkWeeks().get(((settings.getWeekNumber()) + index));
    } catch (java.lang.IndexOutOfBoundsException e) {
        fillMissingWorkWeeks(index);
        return getWorkWeeks().get(((settings.getWeekNumber()) + index));
    }
}