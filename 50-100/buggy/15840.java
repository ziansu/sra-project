private boolean frenchConferenceClassComplete(classscheduling.Day day, classscheduling.Period period) {
    if ((allGradesHaveFrench(day, period)) || (noGradesHaveFrench(day, period))) {
        return true;
    }
    schedule.errors.add((((("French class in " + period) + " on ") + day) + " must be shared by all grades"));
    return false;
}