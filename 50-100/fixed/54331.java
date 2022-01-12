@java.lang.Override
public void onClick(android.view.View v) {
    com.qiang.workout.Models.StopwatchTime stopwatchTime = new com.qiang.workout.Models.StopwatchTime();
    stopwatchTime.setTime((((int) (timeWhenPaused)) / 1000));
    stopwatchTime.setCategory(selectedCategory.getID());
    stopwatchTime.setRecordDate(((java.lang.System.currentTimeMillis()) / 1000));
    dbHandler.addStopwatchTime(stopwatchTime);
    buttonReset.performClick();
}