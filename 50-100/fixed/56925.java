private void checkDeadline() {
    if (edu.berkeley.icsi.sensormonitor.periodicservices.dailysurveys.DailySurveyService.isPassedWindow()) {
        edu.berkeley.icsi.sensormonitor.utils.PreferencesWrapper.setDailyOverlayUnFlagged();
        edu.berkeley.icsi.sensormonitor.utils.PreferencesWrapper.updateDailyDeadline();
    }else
        if ((((edu.berkeley.icsi.sensormonitor.periodicservices.dailysurveys.DailySurveyService.isPassedDeadline()) && (!(edu.berkeley.icsi.sensormonitor.utils.PreferencesWrapper.isGPSSpeedExceed20KPH()))) && (!(edu.berkeley.icsi.sensormonitor.utils.PreferencesWrapper.isDailyDialogOverlayed()))) && (edu.berkeley.icsi.sensormonitor.utils.PreferencesWrapper.isPastSixHoursSinceInstall())) {
            startDailySurveyActivity();
        }
    
}