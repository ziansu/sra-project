private java.lang.String duration() {
    long minute;
    long second;
    if ((timeDiff) < 60) {
        minute = 0;
        second = timeDiff;
    }else {
        minute = (timeDiff) / 60;
        second = (timeDiff) - (minute * 60);
    }
    return ((java.lang.String.format("%02d", minute)) + ":") + (java.lang.String.format("%02d", second));
}