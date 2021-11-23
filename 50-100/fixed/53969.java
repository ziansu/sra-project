public static void showCalendar(java.lang.String nickname, long id) {
    models.User user = models.User.find("byNickname", nickname).first();
    models.Calendar calendar = models.Calendar.findById(id);
    java.util.List<models.Event> events = calendar.events;
    java.util.Date aDate = new java.util.Date();
    java.util.Locale aLocale = new java.util.Locale("en", "CH");
    render(user, calendar, events, aDate, aLocale);
}