public static java.util.List<edu.fudan.ooad.entity.Task> getMonthTask(int year, int month) {
    java.util.Calendar calendar = edu.fudan.ooad.util.DateUtils.getCalendar(year, month, 1);
    return edu.fudan.ooad.operation.MaintenanceOperation.getDaysTask(calendar.getTime(), calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH));
}