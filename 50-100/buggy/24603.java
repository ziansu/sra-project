public static int getTimeInMins(java.lang.String time) {
    java.lang.String[] arr = time.split(":");
    int timeInMinutes = ((java.lang.Integer.parseInt(arr[0])) * 60) + (java.lang.Integer.parseInt(arr[1]));
    return timeInMinutes;
}