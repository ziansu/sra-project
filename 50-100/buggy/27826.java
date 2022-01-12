@org.junit.Test(expected = java.lang.NullPointerException.class)
public void exceptionForNullRepository() {
    try {
        org.openrdf.repository.Repository repository = new org.openrdf.repository.sail.SailRepository(null);
        nl.dtls.fairdatapoint.domain.StoreManager testStoreManager = new nl.dtls.fairdatapoint.domain.StoreManagerImpl(repository);
    } catch (org.openrdf.repository.RepositoryException ex) {
        nl.dtls.fairdatapoint.domain.StoreManagerImplTest.LOGGER.error(ex.getMessage());
        org.junit.Assert.fail("The test is not excepted to throw RepositoryException");
    }
}