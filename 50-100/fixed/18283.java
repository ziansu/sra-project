public java.util.Collection<com.diana.wherefit.pojo.SportActivity> getActivitiesForWeekday(int weekday) {
    org.jsoup.select.Elements allDays = doc.select(".tt_timetable ul.tt_items_list");
    org.jsoup.nodes.Element dayTable = allDays.get(weekday);
    org.jsoup.select.Elements activitiesTable = dayTable.select("li");
    java.util.Collection<com.diana.wherefit.pojo.SportActivity> activities = new java.util.ArrayList<>();
    for (org.jsoup.nodes.Element activityElement : activitiesTable) {
        activities.add(createSportActivityFromElement(activityElement, weekday));
    }
    return activities;
}