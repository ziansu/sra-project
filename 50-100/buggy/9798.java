@java.lang.Override
public java.util.List<com.audit.bl.beans.Loan> getUserLoans(com.audit.bl.beans.User user) {
    java.util.List<com.audit.bl.beans.Loan> loanList = null;
    java.lang.String sql = loanSqls.getProperty("user.select");
    org.hibernate.Query query = getSessionFactory().getCurrentSession().createQuery(sql);
    query.setLong("fromUser", user.getUserId());
    query.setLong("toUser", user.getUserId());
    query.setMaxResults(50);
    loanList = ((java.util.List<com.audit.bl.beans.Loan>) (query.list()));
    return loanList;
}