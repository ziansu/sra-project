@java.lang.Override
public void transfer(example.banking.dao.AccountDao dao, int fromAccountId, int toAccountId, double amount) {
    example.banking.domain.Account fromAccount = dao.find(fromAccountId);
    example.banking.domain.Account toAccount = dao.find(toAccountId);
    double fromBalance = fromAccount.getBalance();
    fromBalance -= amount;
    fromAccount.setBalance(fromBalance);
    double toBalance = toAccount.getBalance();
    toBalance += amount;
    toAccount.setBalance(toBalance);
    dao.save(fromAccount);
    dao.save(toAccount);
}