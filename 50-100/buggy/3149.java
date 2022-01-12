public java.util.Date getEnd() {
    if (!(isDateEmpty())) {
        java.lang.String[] end = this.endDate.split("-");
        return new java.util.Date(((java.lang.Integer.valueOf(end[0])) - 1900), java.lang.Integer.valueOf(end[1]), endDay);
    }else {
        return null;
    }
}