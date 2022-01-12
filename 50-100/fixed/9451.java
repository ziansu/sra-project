@java.lang.Override
@org.springframework.transaction.annotation.Transactional(readOnly = false)
public com.catalina.tokobat.entity.Transaction add(com.catalina.tokobat.entity.Transaction transaction) {
    try {
        em = org.springframework.orm.jpa.EntityManagerFactoryUtils.getTransactionalEntityManager(getJpaTemplate().getEntityManagerFactory());
        transaction = em.merge(transaction);
        em.flush();
        em.close();
        return transaction;
    } catch (java.lang.Exception e) {
        return null;
    }
}