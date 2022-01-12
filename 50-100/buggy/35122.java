public void addLoan(loans.Loan loan) throws java.lang.Exception {
    if (((loans.size()) - 1) == (getMaxBorrowing())) {
        throw new error.SubscriberMaxLimitException(((name) + " has reached their borrowing limit."));
    }
    loan.setSubscriber(this);
    loans.put(loan.getId(), loan);
}