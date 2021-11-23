public com.progressoft.jip.payment.account.AccountDTO getAccount(java.lang.String accountNumber) {
    com.progressoft.jip.payment.account.AccountDTO account = accountDAO.get(accountNumber);
    return getIBAN(account);
}