public java.util.Date past(int atMost, java.util.concurrent.TimeUnit unit) {
    java.util.Date now = new java.util.Date();
    java.util.Date aBitEarlierThanNow = new java.util.Date(((now.getTime()) - 1000));
    return past(atMost, unit, aBitEarlierThanNow);
}