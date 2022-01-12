private void commit(javax.persistence.EntityTransaction transaction) {
    beanManager.fireEvent(new br.com.caelum.vraptor.jpa.event.BeforeCommit());
    if ((!(validator.hasErrors())) && (transaction.isActive())) {
        transaction.commit();
        beanManager.fireEvent(new br.com.caelum.vraptor.jpa.event.AfterCommit());
    }
}