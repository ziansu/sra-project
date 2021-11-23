public com.progressoft.jip.payment.account.AccountDTO getAccount(java.lang.String accountNumber) {
    com.progressoft.jip.payment.account.AccountDTO account = accountDAO.get(accountNumber);
    com.progressoft.jip.payment.account.AccountDTOImpl accountDTO = getIBAN(account);
    return accountDTO;
}