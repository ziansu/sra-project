public void setDate(int day, int month, int year) {
    if ((day < 1) || (day > 31)) {
        throw new java.lang.IllegalArgumentException("Day cannot be less than 1 or more than 31");
    }
    if ((month < 1) || (day > 12)) {
        throw new java.lang.IllegalArgumentException("Month cannot be less than 1 or more than 12");
    }
    if ((year < 1000) || (year > 9999)) {
        throw new java.lang.IllegalArgumentException("Year must be a four digit number");
    }
    this.date = java.lang.String.format("%2$d/%2$d/%s", day, month, year);
}