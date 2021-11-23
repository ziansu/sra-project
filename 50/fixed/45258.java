public java.util.Date getEndDate() {
    java.util.Date date;
    if ((_endDate) != null) {
        date = new java.util.Date(_endDate.getTime());
    }else {
        date = getStartDate();
    }
    return date;
}