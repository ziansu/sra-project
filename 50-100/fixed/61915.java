private void addWeekDay(java.util.List<java.lang.String> list) {
    java.lang.String weekDay = list.get(1);
    if (weekDay.isEmpty()) {
        return ;
    }
    processWeekDay(weekDay, 0, (-28), (-13));
    processWeekDay(weekDay, 1, (-28), (-1));
    processWeekDay(weekDay, 2, (-28), 11);
}