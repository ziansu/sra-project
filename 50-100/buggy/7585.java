public static int differenceInDays(java.util.Date firstDate, java.util.Date secondDate) {
    long difference = (firstDate.getTime()) - (secondDate.getTime());
    int diffDays = ((int) (difference)) / (((24 * 60) * 60) * 1000);
    return diffDays;
}