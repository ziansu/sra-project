public java.lang.String getConceptForwardingAddress(java.lang.String identifier) {
    java.lang.String forwardingAddress = null;
    for (biocode.fims.digester.Entity entity : entities) {
        if (entity.getIdentifier().equals(identifier)) {
            forwardingAddress = entity.getConceptForwardingAddress();
            break;
        }
    }
    return forwardingAddress;
}