public void initializeGraph() {
    for (java.lang.Class weeklyClass : classes) {
        for (application.GraduateAssistant ga : students) {
            if ((ga.isAvailable(weeklyClass.getDaysOfWeek(), weeklyClass.getStartTime(), weeklyClass.getEndTime())) && (ga.isQualified(weeklyClass.getClassNumber()))) {
                weeklyClass.addAvailableGA(ga);
                ga.addPossibleGAClass(weeklyClass);
            }
        }
    }
}