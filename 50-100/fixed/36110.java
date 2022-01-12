@java.lang.Override
public void loansConfirmed() {
    if ((state) == (state.CONFIRMING_LOANS)) {
        if ((loanList.size()) > 0) {
            for (library.interfaces.entities.ILoan loanList1 : loanList) {
                loanDAO.commitLoan(loanList1);
            }
            setState(state.COMPLETED);
            printer.print(getLoansDetail());
        }else {
            throw new java.lang.RuntimeException("There are no loans to commit.");
        }
    }else {
        throw new java.lang.RuntimeException(("You are not in a state to " + "confirm loans."));
    }
}