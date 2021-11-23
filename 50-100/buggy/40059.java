@java.lang.Override
public void transfer(int fromAccountId, int toAccountId, double amount) {
    example.banking.dao.AccountDao dao = new example.banking.dao.InMemoryAccountDao();
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