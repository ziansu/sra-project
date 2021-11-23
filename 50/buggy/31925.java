public void checkout(User u, org.joda.time.LocalDate dateOfLoan) {
    if (dateOfLoan == null) {
        dateOfLoan = new org.joda.time.LocalDate();
    }
    loaneeUser = u;
    isLoanedOut = true;
    loanedOutDate = dateOfLoan;
}