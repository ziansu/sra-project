public void refresh() throws java.lang.Exception {
    org.osgi.service.repository.Repository repository = readRepository();
    save(repository);
    this.bridge = new aQute.bnd.osgi.repository.BridgeRepository(repository);
}