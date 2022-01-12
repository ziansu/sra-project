public java.lang.String getTimeDiff(java.util.Date dateOne, java.util.Date dateTwo) {
    java.lang.String diff = "";
    long timeDiff = java.lang.Math.abs(((dateOne.getTime()) - (dateTwo.getTime())));
    diff = java.lang.String.format("%d", java.util.concurrent.TimeUnit.MILLISECONDS.toDays(timeDiff), (-(java.util.concurrent.TimeUnit.HOURS.toDays(timeDiff))));
    return diff;
}