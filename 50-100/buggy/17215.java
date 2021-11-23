public boolean has(final java.util.Date next) {
    java.util.Date startDate = getStartDate(next);
    java.util.Date endDate = getEndDate(next);
    return ((startDate.getTime()) <= (next.getTime())) && (endDate.after(next));
}