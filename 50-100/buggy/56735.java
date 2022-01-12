private int getPositionForDay(@android.support.annotation.Nullable
org.threeten.bp.LocalDate day) {
    if (day == null) {
        return -1;
    }
    int offsetDays = ((int) (mMinDate.until(day, ChronoUnit.DAYS)));
    return (offsetDays + (mOffset)) / (com.example.calendar_agenda.week.WeekAdapter.DAYS_IN_WEEK);
}