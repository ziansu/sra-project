public void setReturnDate(long returnDate, android.content.Context context) {
    this.returnDate = returnDate;
    if ((returnDate < (loanDate)) && (returnDate != (-1))) {
        android.util.Log.i(org.bbt.kiakoa.model.Loan.TAG, "return date should not be lower than loan date");
        setLoanDate(returnDate, context);
    }
}