public static Model.Account loadAccount(java.lang.Integer account_id) {
    Model.Account account;
    org.hibernate.Session session = Model.HibernateUtil.getSessionFactory().getCurrentSession();
    session.beginTransaction();
    account = ((Model.Account) (session.get(Model.Account.class, account_id)));
    session.getTransaction().commit();
    return account;
}