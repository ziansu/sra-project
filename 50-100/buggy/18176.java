public static int interval(java.util.Date date) {
    long now = new java.util.Date().getTime();
    long thatTime = date.getTime();
    return (((java.lang.Math.abs((((int) (now - thatTime)) / 1000))) / 60) / 60) / 24;
}