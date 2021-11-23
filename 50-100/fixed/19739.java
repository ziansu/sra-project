@java.lang.Override
public java.util.List<com.osc.biz.bean.account.AccountBean> getGifiAccountBalances(java.util.Date cutOffDate, com.osc.biz.enums.AccountType accountType, java.lang.Integer accountId) {
    java.lang.Object[] params = new java.lang.Object[]{ cutOffDate , cutOffDate , accountId , accountType == null ? null : accountType.getId() };
    java.util.List<com.osc.biz.bean.account.AccountBean> list = ((java.util.List<com.osc.biz.bean.account.AccountBean>) (gifiAccountBalancesQuery.execute(params)));
    return list;
}