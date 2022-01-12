private static java.lang.String modifyTime(java.lang.String time) {
    int hour = java.lang.Integer.parseInt(time.substring(0, 2));
    java.lang.String ampm = time.substring(6, 8);
    if (ampm.equalsIgnoreCase("am")) {
        return time;
    }else {
        if (hour == 12) {
            return time;
        }else {
            hour = hour + 12;
            return (hour + ":") + (time.substring(3));
        }
    }
}