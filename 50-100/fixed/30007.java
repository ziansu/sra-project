public workerLogic.WorkWeek getXweek(int index) {
    if ((getWorkWeeks().size()) < ((settings.getWeekNumber()) + index))
        fillMissingWorkWeeks(index);
    
    return getWorkWeeks().get(((settings.getWeekNumber()) + index));
}