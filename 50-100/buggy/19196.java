@java.lang.Override
public void loggedIn(org.shaolin.vogerp.commonmodel.be.IPersonalInfo userInfo) {
    org.shaolin.vogerp.accounting.be.CustomerAccountImpl scObject = new org.shaolin.vogerp.accounting.be.CustomerAccountImpl();
    scObject.setOrgId(org.shaolin.bmdp.runtime.security.UserContext.getUserContext().getOrgId());
    java.util.List<org.shaolin.vogerp.accounting.be.ICustomerAccount> result = AccountingModel.INSTANCE.searchAccount(scObject, null, 0, 1);
    if ((result.size()) == 0) {
        return ;
    }
    org.shaolin.bmdp.runtime.security.UserContext.addUserData("CustAccountId", result.get(0).getAccountId());
}