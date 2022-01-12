private java.lang.Integer getWeekDayNumber(java.lang.String weekDayName) {
    java.util.List<java.lang.String> weekDays = getWeekDays();
    int i = 0;
    for (java.lang.String weekDayString : weekDays) {
        if (weekDayString.equals(weekDayName)) {
            return new java.lang.Integer(i);
        }
        i++;
    }
    return null;
}