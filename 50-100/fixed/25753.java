@java.lang.Override
public void fundTransfer(int accNo1, int accNo2, float amt) throws com.exceptions.InsufficientBalanceException, com.exceptions.InvalidAccountNoException, com.exceptions.ServiceNotAvailableException {
    this.withdraw(accNo1, amt);
    this.deposit(accNo2, amt);
    java.lang.System.out.println("fund transfered current details..");
    try {
        dao.showAcc(accNo1);
        dao.showAcc(accNo2);
    } catch (java.sql.SQLException e) {
        throw new com.exceptions.ServiceNotAvailableException();
    }
}