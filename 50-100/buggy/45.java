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
        if (date.before(startDate)) {
            return Task.SCHEDULED;
        }
    
    if (startDate.after(endDate)) {
        return Task.ACTIVE;
    }
    return Task.FAILED;
}