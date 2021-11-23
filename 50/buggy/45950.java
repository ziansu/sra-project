@java.lang.Override
public void saveBorrowerInfo(com.bishal.lmscrud.model.Borrower borrower) {
    sessionFactory.openSession();
    getsession().merge(borrower);
}