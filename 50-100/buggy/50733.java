@java.lang.Override
public java.util.List<com.audit.bl.beans.Loan> getAllLoans() {
    java.util.List<com.audit.bl.beans.Loan> loanList = null;
    java.lang.String sql = loanSqls.getProperty("loan.select");
    org.hibernate.Query query = getSessionFactory().getCurrentSession().createQuery(sql);
    query.setMaxResults(50);
    loanList = ((java.util.List<com.audit.bl.beans.Loan>) (query.list()));
    return loanList;
}