public java.util.ArrayList<java.lang.Integer> convertTimesToSeconds(java.util.ArrayList<java.lang.String> spentTimes, java.lang.String timeFormat) {
    java.util.ArrayList<java.lang.Integer> secondsSpent = new java.util.ArrayList<java.lang.Integer>();
    for (java.lang.String spentTime : spentTimes) {
        secondsSpent.add(DataHandler.convertTimeToSeconds(DataHandler.findInBetween(timeFormat, ':'), convertStringsToInts(DataHandler.findInBetween(spentTime, ':'))));
    }
    return secondsSpent;
}