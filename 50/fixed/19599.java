public void saveConnections(java.util.List<org.talend.core.model.general.ConnectionBean> connectionsBeans) {
    perReader.saveConnections(connectionsBeans);
    if (connectionsBeans != (storedConnections)) {
        setStoredConnections(connectionsBeans);
    }
    init();
}