public java.lang.String studentRequestChange() throws java.lang.Exception {
    org.hibernate.Session session = model.Util.sessionFactory.openSession();
    org.hibernate.Transaction trans = session.beginTransaction();
    java.lang.String hql = ("update StudentProfile s set s.isPassed=0" + " where s.id=") + (java.lang.String.valueOf(userid));
    org.hibernate.Query q = session.createQuery(hql);
    int ret = q.executeUpdate();
    java.lang.System.out.println(ret);
    trans.commit();
    if (ret == 0) {
        strValue = com.opensymphony.xwork2.ActionSupport.SUCCESS;
        return com.opensymphony.xwork2.ActionSupport.SUCCESS;
    }else
        return com.opensymphony.xwork2.ActionSupport.ERROR;
    
}