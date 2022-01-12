@java.lang.Override
protected void onHandleIntent(@android.support.annotation.Nullable
android.content.Intent intent) {
    java.lang.System.out.println("workout notification check");
    try {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int dayOfWeek = calendar.get(java.util.Calendar.DAY_OF_WEEK);
        if ((dayOfWeek >= 2) && (dayOfWeek <= 6)) {
            checkHourSelection();
        }
        com.oneminutebefore.workout.helpers.IntentUtils.scheduleWorkoutNotifications(getApplicationContext());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}