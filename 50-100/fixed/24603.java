public static long getTimeInMins(java.lang.String time) {
    java.lang.String[] arr = time.split(":");
    long timeInMinutes = ((java.lang.Long.parseLong(arr[0])) * 60) + (java.lang.Long.parseLong(arr[1]));
    return timeInMinutes;
}