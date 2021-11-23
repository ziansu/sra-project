@org.springframework.context.annotation.Bean
public org.springframework.orm.jpa.JpaTransactionManager readableTransactionManager() throws java.lang.Exception {
    final org.springframework.orm.jpa.JpaTransactionManager transactionManager = new org.springframework.orm.jpa.JpaTransactionManager();
    try {
        transactionManager.setEntityManagerFactory(this.readableEntityManagerFactory().getObject());
        transactionManager.setTransactionSynchronization(JpaTransactionManager.SYNCHRONIZATION_ALWAYS);
    } catch (final java.lang.ClassNotFoundException e) {
        final java.lang.String msg = "Error in creating transaction manager bean";
        com.alliander.osgp.logging.domain.config.ReadOnlyLoggingConfig.LOGGER.error(msg, e);
        throw new java.lang.Exception(msg, e);
    }
    return transactionManager;
}