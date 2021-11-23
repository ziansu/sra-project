public static java.util.Date dateBeforeHours(java.util.Date date, int hours) {
    java.lang.Long spitTime = ((long) (((60 * 60) * 1000) * hours));
    org.com.dms.sms.util.Htmltools.LOG.info(("spitTime:" + spitTime));
    java.lang.Long time = (date.getTime()) - spitTime;
    return new java.util.Date(time);
}