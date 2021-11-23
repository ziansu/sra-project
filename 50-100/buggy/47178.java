@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    android.util.Log.d(com.ishan1608.googlefittest.GoogleFitService.TAG, "onHandleIntent called");
    if (intent != null) {
        final java.lang.String action = intent.getAction();
        switch (action) {
            case com.ishan1608.googlefittest.GoogleFitService.STEPS_PER_SECOND_COUNT :
                handleActionStepsPerSecond();
                break;
            case com.ishan1608.googlefittest.GoogleFitService.STEP_COUNT_TODAY :
                handleActionStepCountToday();
                break;
            case com.ishan1608.googlefittest.GoogleFitService.MILES_COUNT_TODAY :
                handleActionMilesCountToday();
                break;
            case com.ishan1608.googlefittest.GoogleFitService.CALORIES_EXPENDED_TODAY :
                handleActionCaloriesExpendedToday();
                break;
        }
    }
}