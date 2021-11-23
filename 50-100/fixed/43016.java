public java.util.List getTutors(org.joda.time.DateTime rightNow) {
    java.util.List result = new java.util.ArrayList();
    int day = rightNow.getDayOfWeek();
    int hour = rightNow.getHourOfDay();
    for (int i = 0; i < (allTutors.size()); i++) {
        if (isWorking((day - 1), allTutors.get(i), hour))
            result.add(allTutors.get(i));
        
    }
    return result;
}