public void refresh() throws java.lang.Exception {
    bridge = new aQute.bnd.osgi.repository.BridgeRepository(save(readRepository()));
}