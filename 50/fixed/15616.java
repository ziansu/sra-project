public void selectField(java.lang.String column, java.lang.String pattern, java.util.Calendar calendar) {
    this.pattern.put(column, pattern);
    this.calendar.put(column, calendar);
    selectField(java.util.Date.class, column);
}