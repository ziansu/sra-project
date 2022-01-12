private static int getNumberOfWeeksOfYear(int year) {
    com.timodenk.gswnstupla.StuplaControl.calendar.set(java.util.Calendar.YEAR, year);
    com.timodenk.gswnstupla.StuplaControl.calendar.set(java.util.Calendar.MONTH, java.util.Calendar.DECEMBER);
    com.timodenk.gswnstupla.StuplaControl.calendar.set(java.util.Calendar.DAY_OF_MONTH, 31);
    int ordinalDay = com.timodenk.gswnstupla.StuplaControl.calendar.get(java.util.Calendar.DAY_OF_YEAR);
    int weekDay = (com.timodenk.gswnstupla.StuplaControl.calendar.get(java.util.Calendar.DAY_OF_WEEK)) - 1;
    return ((ordinalDay - weekDay) + 10) / 7;
}