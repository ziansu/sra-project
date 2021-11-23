private int calculateAverageSteps(java.util.List<grimesmea.gmail.com.pricklefit.DailyStepsDTO> dailyStepTotals) {
    long totalSteps = 0;
    int totalDays = 0;
    for (grimesmea.gmail.com.pricklefit.DailyStepsDTO dailyStepsDTO : dailyStepTotals) {
        totalSteps += dailyStepsDTO.getSteps();
        totalDays++;
    }
    if (totalDays == 0) {
        return 0;
    }else {
        return ((int) (totalSteps)) / totalDays;
    }
}