private static java.lang.String toMilitaryTime(java.lang.String time) {
    java.lang.String period = time.substring(8, time.length());
    int hour = java.lang.Integer.parseInt(time.substring(0, 2));
    if (period.equals("PM")) {
        hour += 12;
    }else {
        if (hour == 12)
            hour = 0;
        
    }
    return (java.lang.String.format("%02d", hour)) + (time.substring(2, 8));
}