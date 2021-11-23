private boolean isDateToShow(java.util.Date date) {
    java.util.Date firstOfMonth = be.rla.jtaken.helpers.DateHelper.getFirstOfMonth(startDateShow);
    return (date.after(firstOfMonth)) || (date.equals(firstOfMonth));
}