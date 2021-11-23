public void setEndDate(java.util.Date endDate) {
    if ((startDate) != null) {
        checkFecha(startDate, endDate);
    }
    this.endDate = endDate;
}