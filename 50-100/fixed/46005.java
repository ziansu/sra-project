public java.util.Date getLatestDate() {
    java.util.Date lastDate = null;
    if ((this.dateRange) == null)
        return null;
    
    for (carelender.model.data.DateRange dateR : this.dateRange) {
        if (lastDate == null) {
            lastDate = dateR.getEnd();
        }else {
            if (dateR.getEnd().after(lastDate)) {
                lastDate = dateR.getEnd();
            }
        }
    }
    return lastDate;
}