public static int getTimeBySec(java.lang.String timeText) {
    java.lang.String[] splitedTime = timeText.split(":");
    int timeBySec = ((java.lang.Integer.parseInt(splitedTime[0])) * 60) + (java.lang.Integer.parseInt(splitedTime[1]));
    return timeBySec;
}