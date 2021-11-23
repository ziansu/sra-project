@java.lang.Override
public java.util.List<com.audit.bl.beans.Loan> getToUserLoans(com.audit.bl.beans.User toUser) {
    java.util.List<com.audit.bl.beans.Loan> loanList = null;
    java.lang.String sql = loanSqls.getProperty("to.select");
    org.hibernate.Query query = getSessionFactory().getCurrentSession().createQuery(sql);
    query.setLong("toUser", toUser.getUserId());
    loanList = ((java.util.List<com.audit.bl.beans.Loan>) (query.list()));
    return loanList;
}