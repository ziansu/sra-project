public void setEndDate(net.sf.memoranda.date.CalendarDate date) {
    if (date == null) {
        setAttr("endDate", "");
    }else {
        setAttr("endDate", date.toString());
    }
}