public void registerHours(double activityID, int date, double hours) {
    int totalActivities = week.get(currentWeek).size();
    for (java.util.ArrayList<java.lang.Double> aProjectWeek : week.get(currentWeek)) {
        if ((aProjectWeek.get(0)) == activityID) {
            aProjectWeek.set(date, hours);
            java.lang.System.out.println(date);
            java.lang.System.out.println(hours);
        }
    }
}