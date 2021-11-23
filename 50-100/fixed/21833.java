private void notifyAllClients(mt.Order order) throws mt.exception.ServerException {
    mt.server.MicroServer.LOGGER.log(java.util.logging.Level.INFO, "Notifying clients about the new order...");
    if (order == null) {
        throw new mt.exception.ServerException("There was no order in the message");
    }
    for (java.util.Map.Entry<java.lang.String, java.util.Set<mt.Order>> entry : orderMap.entrySet()) {
        serverComm.sendOrder(entry.getKey(), order);
    }
}