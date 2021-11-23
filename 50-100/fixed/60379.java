private int compareDate(java.util.Calendar date1, java.util.Calendar date2) {
    if ((date1 == null) && (date2 == null)) {
        return 0;
    }else
        if (date1 == null) {
            return 1;
        }else
            if (date2 == null) {
                return -1;
            }else {
                return org.apache.commons.lang.time.DateUtils.truncatedCompareTo(date1, date2, java.util.Calendar.MINUTE);
            }
        
    
}