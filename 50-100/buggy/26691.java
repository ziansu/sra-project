private java.util.Date getNextRunTimeWithJumpWeekLimit(java.util.Date currentDate) {
    java.util.Date nowDate = (currentDate == null) ? new java.util.Date() : currentDate;
    java.util.Date nextDate = getNext(nowDate);
    while ((!(com.demo.utils.Util.isIntegralMultipleWeeksLater(nowDate, nextDate, dayOfWeekField.getSkipWeekCount()))) && (!(isYearOutOfRange(nextDate)))) {
        nextDate = getNext(nextDate);
    } 
    return nextDate;
}