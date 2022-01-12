@java.lang.Override
public void saveBorrowerInfo(com.bishal.lmscrud.model.Borrower borrower) {
    getsession().merge(borrower);
}