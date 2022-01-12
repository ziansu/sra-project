@java.lang.Override
public void onRestoreInstanceState(@android.support.annotation.NonNull
android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    java.lang.String date = savedInstanceState.getString("DateTime");
    int[] dateTime = parseDateTimeString(date);
    if (dateTime != null) {
        dp.updateDate(dateTime[2], ((dateTime[1]) - 1), dateTime[0]);
        tp.setHour(dateTime[3]);
        tp.setMinute(dateTime[4]);
        targetDateTime = setTargetDateTime(dateTime);
    }
}