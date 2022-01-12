public java.lang.String timeQuantityBetween(org.joda.time.DateTime since, org.joda.time.DateTime until) {
    long diff = new org.joda.time.Duration(since, until).getMillis();
    if (diff <= 1000) {
        return "0 " + (l10n.getString("TimeUnit.seconds"));
    }
    if (diff < (nl.juraji.biliomi.components.shared.TimeFormatter.MILLIS_IN_MONTH)) {
        return timeStringSmallScale(new org.joda.time.Period(since, until, org.joda.time.PeriodType.dayTime()));
    }else {
        return timeStringLargeScale(new org.joda.time.Period(since, until, org.joda.time.PeriodType.yearMonthDay()));
    }
}