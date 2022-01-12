@java.lang.Override
public void onDateSet(int year, int month, int day) {
    mEtDateTime.setText(java.lang.String.format("%d/%d/%d", day, month, year));
    this.year = year;
    this.month = month;
    this.day = day;
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.set(java.util.Calendar.MONTH, month);
    calendar.set(java.util.Calendar.DAY_OF_MONTH, day);
    calendar.set(java.util.Calendar.YEAR, year);
    availableHours = br.alexandrenavarro.scheduling.util.WorkHoursUtils.generate(calendar);
    loadScheduling();
}