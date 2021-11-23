protected org.komodo.spi.KException handleError(final org.komodo.spi.repository.Repository.UnitOfWork transactionParameter, final org.komodo.spi.repository.Repository.UnitOfWork transactionVariable, final java.lang.Exception e) {
    assert e != null;
    assert ((transactionParameter == null) && (transactionVariable != null)) || ((transactionParameter != null) && (transactionVariable == null));
    if (transactionParameter == null) {
        transactionVariable.rollback();
    }
    if (e instanceof org.komodo.spi.KException) {
        return ((org.komodo.spi.KException) (e));
    }
    return new org.komodo.spi.KException(e);
}