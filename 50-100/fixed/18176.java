public static int interval(java.util.Date date) {
    long now = new java.util.Date().getTime();
    long thatTime = date.getTime();
    return ((((int) (java.lang.Math.abs(((now - thatTime) / 1000)))) / 60) / 60) / 24;
}