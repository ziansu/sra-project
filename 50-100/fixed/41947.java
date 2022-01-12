public <T> T createObject(java.lang.Class<T> clazz, org.openrdf.model.URI context, org.openrdf.model.Resource id) throws java.lang.IllegalAccessException, java.lang.InstantiationException, org.openrdf.repository.RepositoryException {
    com.github.anno4j.Transaction transaction = createTransaction();
    transaction.setAllContexts(context);
    return transaction.createObject(clazz, id);
}