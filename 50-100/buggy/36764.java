public java.util.Date getStart() {
    if (!(isDateEmpty())) {
        java.lang.String[] start = this.startDate.split("-");
        return new java.util.Date(((java.lang.Integer.valueOf(start[0])) - 1900), java.lang.Integer.valueOf(start[1]), startDay);
    }else {
        return null;
    }
}