@org.apache.struts2.interceptor.validation.SkipValidation
public java.lang.String loadData() throws java.lang.Exception {
    try {
        lists = getList();
        dbTransaction.commit();
    } catch (org.hibernate.HibernateException e) {
        if ((dbTransaction) != null) {
            dbTransaction.rollback();
        }
        e.printStackTrace();
    } finally {
        session.close();
    }
    return SUCCESS;
}