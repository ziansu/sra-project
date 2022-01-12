private int calculateAverageSteps(java.util.List<grimesmea.gmail.com.pricklefit.DailyStepsDTO> dailyStepTotals) {
    long totalSteps = 0;
    int totalDays = 0;
    for (grimesmea.gmail.com.pricklefit.DailyStepsDTO dailyStepsDTO : dailyStepTotals) {
        totalSteps += dailyStepsDTO.getSteps();
        totalDays++;
    }
    return ((int) (totalSteps)) / totalDays;
}