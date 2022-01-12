public static void currentCalendar(java.lang.String name) {
    java.util.Calendar juc = java.util.Calendar.getInstance(controllers.Application.getLocale());
    juc.setTime(new java.util.Date());
    java.lang.String userName = controllers.Security.connected();
    controllers.Application.calendar(userName, name, juc.get(java.util.Calendar.DAY_OF_MONTH), juc.get(java.util.Calendar.MONTH), juc.get(java.util.Calendar.YEAR));
}