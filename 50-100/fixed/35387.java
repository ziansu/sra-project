private void setDate(final java.lang.String date) {
    java.lang.String[] dateVec = date.split("-");
    time = new java.util.GregorianCalendar(java.lang.Integer.parseInt(dateVec[0]), ((java.lang.Integer.parseInt(dateVec[1])) - 1), java.lang.Integer.parseInt(dateVec[2]));
}