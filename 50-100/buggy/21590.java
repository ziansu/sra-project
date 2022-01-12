public int differenceInDays() {
    java.util.Date date1 = endDate.getTime();
    java.util.Date date2 = startingDate.getTime();
    long diff = (date2.getTime()) - (date1.getTime());
    return ((int) (java.util.concurrent.TimeUnit.DAYS.convert(diff, java.util.concurrent.TimeUnit.MILLISECONDS)));
}