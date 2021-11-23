@com.loans.controller.RequestMapping(value = "/loan/status", method = RequestMethod.GET)
public boolean getStatus(@com.loans.controller.RequestParam(value = "uniqueLoanId")
java.lang.String uid) {
    com.loans.bean.entity.Loan loan = loanRepository.findByuniqueLoanId(uid);
    return loan.isStatus();
}