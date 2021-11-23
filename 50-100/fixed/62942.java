public boolean eligibleToLoan() {
    if ((loancount) >= 3)
        return false;
    
    for (Book b : books_loaned) {
        org.joda.time.DateTime timeOfLoan = b.getLoanedOutDate().toDateTimeAtStartOfDay();
        int days = org.joda.time.Days.daysBetween(timeOfLoan.withTimeAtStartOfDay(), new org.joda.time.DateTime().withTimeAtStartOfDay()).getDays();
        if (days >= 28) {
            return false;
        }
    }
    return true;
}