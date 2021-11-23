private int getDateBlock(java.util.Date date) {
    int i = 0;
    java.util.Date previous = null;
    for (java.util.Date d : validDates) {
        if (date.equals(d)) {
            return i;
        }
        if (previous != null) {
            long days = getDifferenceDays(d, previous);
            if (days > 1) {
                i++;
            }
        }
        previous = d;
    }
    return -1;
}