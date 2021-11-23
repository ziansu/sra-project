protected boolean isDateInInterval(java.lang.Long offset, java.lang.Long limit) {
    java.util.Date offsetDate = new java.util.Date(offset);
    java.util.Date limitDate = new java.util.Date(limit);
    java.util.Date elementDate = new java.util.Date(this.getTimestamp());
    return (elementDate.after(offsetDate)) && (elementDate.before(limitDate));
}