protected int getLocalPosition(@android.support.annotation.NonNull
java.util.Date date) {
    long DAY = ((24 * 60) * 60) * 1000;
    long shiftDays = ((date.getTime()) / DAY) - ((startDate.getTimeInMillis()) / DAY);
    return ((int) (shiftDays));
}