public static java.lang.String getTimeKey(java.lang.String timeMeridian) {
    java.lang.String time = timeMeridian.split(" ")[0];
    java.lang.String meridian = timeMeridian.split(" ")[1];
    int hour = java.lang.Integer.parseInt(time.split(":")[0]);
    if (meridian.equals("P.M")) {
        hour += 12;
    }
    return hour + "_59";
}