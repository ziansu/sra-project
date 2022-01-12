@java.lang.Override
boolean hasEntity(java.lang.Long id) {
    return (id != null) && (tagFacadeGateway.isInTagCache(id));
}