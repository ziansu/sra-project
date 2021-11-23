protected int getLocalPosition(@android.support.annotation.NonNull
java.util.Date date) {
    long DAY = ((24 * 60) * 60) * 1000;
    long shiftDays = ((startDate.getTimeInMillis()) / DAY) - ((date.getTime()) / DAY);
    return ((int) (shiftDays));
}