public static com.example.anna.shedule.application.schedule.model.helper.WeekPeriodicity getPeriodicity(long timeInMillis) {
    long diff = timeInMillis - (com.example.anna.shedule.application.schedule.model.helper.WeekPeriodicity.START_OF_YEAR_2015);
    long days = java.util.concurrent.TimeUnit.DAYS.convert(diff, java.util.concurrent.TimeUnit.MILLISECONDS);
    int currentWeek = ((int) (days / 7));
    return (currentWeek % 2) == 0 ? com.example.anna.shedule.application.schedule.model.helper.WeekPeriodicity.RED : com.example.anna.shedule.application.schedule.model.helper.WeekPeriodicity.BLUE;
}