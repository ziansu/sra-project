private boolean isDateToShow(java.util.Date date) {
    java.util.Date firstOfMonth = getFirstOfMonth(startDateShow);
    return (date.after(firstOfMonth)) || (date.equals(firstOfMonth));
}