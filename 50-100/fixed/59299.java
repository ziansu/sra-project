private void commit(javax.persistence.EntityTransaction transaction) {
    if (transaction.isActive())
        beanManager.fireEvent(new br.com.caelum.vraptor.jpa.event.BeforeCommit());
    
    if ((!(validator.hasErrors())) && (transaction.isActive())) {
        transaction.commit();
        beanManager.fireEvent(new br.com.caelum.vraptor.jpa.event.AfterCommit());
    }
}