public com.jeet.api.Tokens getToken2(java.lang.String token1) {
    com.jeet.db.DAO.session = factory.getCurrentSession();
    com.jeet.db.DAO.trans = com.jeet.db.DAO.session.getTransaction();
    if ((com.jeet.db.DAO.trans.getStatus()) != (org.hibernate.resource.transaction.spi.TransactionStatus.ACTIVE)) {
        com.jeet.db.DAO.trans.begin();
    }
    java.lang.String hql = "from Tokens where token1 = :mToken1";
    org.hibernate.Query query = com.jeet.db.DAO.session.createQuery(hql);
    query.setParameter("mToken1", token1);
    com.jeet.api.Tokens token_swift = ((com.jeet.api.Tokens) (query.uniqueResult()));
    com.jeet.db.DAO.trans.commit();
    return token_swift;
}