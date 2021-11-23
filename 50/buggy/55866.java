@java.lang.Override
public void registered(org.shaolin.vogerp.commonmodel.be.IPersonalInfo userInfo) {
    org.shaolin.vogerp.accounting.be.CustomerAccountImpl newAccount = new org.shaolin.vogerp.accounting.be.CustomerAccountImpl();
    newAccount.setAccountId(org.shaolin.vogerp.accounting.internal.AccountingServiceImpl.genAccountNumber());
    newAccount.setOrgId(org.shaolin.bmdp.runtime.security.UserContext.getUserContext().getOrgId());
    AccountingModel.INSTANCE.create(newAccount);
}