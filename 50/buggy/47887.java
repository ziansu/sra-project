@org.springframework.context.annotation.Bean
@org.springframework.beans.factory.annotation.Autowired
public org.springframework.orm.hibernate4.HibernateTransactionManager transactionManager(org.hibernate.SessionFactory s) {
    com.vincent.SSHProject.configuration.DBConfig.logger.info("transactionManager");
    org.springframework.orm.hibernate4.HibernateTransactionManager txManager = new org.springframework.orm.hibernate4.HibernateTransactionManager();
    txManager.setSessionFactory(s);
    return txManager;
}