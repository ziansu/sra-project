public ee.tartu.jpg.timetable.data.Day getDayIn(int daysAfterToday) {
    java.util.List<ee.tartu.jpg.timetable.data.Day> dayList = getAll(ee.tartu.jpg.timetable.data.Day.class);
    int dayIdx = getDayIndexIn(daysAfterToday, dayList);
    return dayIdx >= 0 ? dayList.get(dayIdx) : null;
}