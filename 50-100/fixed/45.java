public int getStatus(net.sf.memoranda.date.CalendarDate date) {
    if (frozen) {
        return Task.FROZEN;
    }
    if ((progress) == 100) {
        return Task.COMPLETED;
    }
    if (date.inPeriod(startDate, endDate)) {
        if (date.equals(endDate))
            return Task.DEADLINE;
        else
            return Task.ACTIVE;
        
    }else
        if (startDate.before(date)) {
            return Task.SCHEDULED;
        }
    
    return Task.FAILED;
}