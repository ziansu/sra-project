@java.lang.Override
public com.jlfex.hermes.model.UserAccount chargeUserAccount(com.jlfex.hermes.model.UserAccount account, java.lang.Double amount) {
    account.setBalance(account.getBalance().add(new java.math.BigDecimal(amount)));
    return userAccountRepository.save(account);
}