@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void nullURI() {
    org.openrdf.sail.Sail store = new org.openrdf.sail.memory.MemoryStore();
    org.openrdf.repository.Repository repository = new org.openrdf.repository.sail.SailRepository(store);
    nl.dtls.fairdatapoint.domain.StoreManager testStoreManager;
    try {
        testStoreManager = new nl.dtls.fairdatapoint.domain.StoreManagerImpl(repository);
        if (testStoreManager.retrieveResource(null).hasNext()) {
            org.junit.Assert.fail("No RDF statements excepted for NULL URI");
        }
    } catch (org.openrdf.repository.RepositoryException | nl.dtls.fairdatapoint.domain.StoreManagerException ex) {
        nl.dtls.fairdatapoint.domain.StoreManagerImplTest.LOGGER.error(ex.getMessage());
        org.junit.Assert.fail(("The test is not excepted to throw RepositoryException or " + "StoreManagerException"));
    }
}