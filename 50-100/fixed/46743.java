protected int getCurrentActiveLinksNbInput(int connectionCategory) {
    int nb = 0;
    for (org.talend.core.model.process.IConnection connection : getIncomingConnections()) {
        if ((connection.isActivate()) && (connection.getLineStyle().hasConnectionCategory(connectionCategory))) {
            nb++;
        }
    }
    return nb;
}