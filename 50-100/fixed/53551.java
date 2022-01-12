@java.lang.Override
public void commitLoan(library.interfaces.entities.ILoan loan) {
    if (loan == null) {
        throw new java.lang.IllegalArgumentException("loan cannot be null");
    }
    int loanID = ++(this.nextLoanID);
    loan.commit(loanID);
    this.loanMap.put(loanID, loan);
}