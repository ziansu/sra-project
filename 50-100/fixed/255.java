private void saveTestRunState() {
    testRun.currentBay = testRun.currentStepUnitsTested;
    testRunSavedState = gson.toJson(testRun);
    if ((testRun.currentStepUnitsTested) < (testRun.numberOfActiveBays)) {
        if ((testRun.currentTestStep) != 5) {
            timerHandler.removeCallbacks(timerRunnable);
            timerHandler.post(timerRunnable);
        }else {
            timerHandler.removeCallbacks(timerRunnable);
        }
    }else
        timerHandler.removeCallbacks(timerRunnable);
    
    editor.putBoolean(MainActivity.TAG_RESUME_AVAILABLE, true);
    editor.putString(com.scentair.scentwave.TestRunActivity.TAG_SAVED_TEST_RUN, testRunSavedState);
    editor.commit();
}