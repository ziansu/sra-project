private boolean _isToday(java.util.Date date) {
    java.lang.Long time = date.getTime();
    time = time - (time % (java.util.concurrent.TimeUnit.DAYS.toMillis(1)));
    time = time - (java.util.concurrent.TimeUnit.MINUTES.toMillis(330));
    return date.after(new java.util.Date(time));
}