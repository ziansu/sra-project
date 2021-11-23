protected boolean isDateInInterval(java.lang.Long offset, java.lang.Long limit) {
    java.util.Date offsetDate = new java.util.Date((offset * 1000));
    java.util.Date limitDate = new java.util.Date((limit * 1000));
    java.util.Date elementDate = new java.util.Date(((this.getTimestamp()) * 1000));
    return (elementDate.after(offsetDate)) && (elementDate.before(limitDate));
}