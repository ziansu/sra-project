public java.util.Set<org.openbaton.vnfm.catalogue.Application> queryByVnfrId(java.lang.String vnfrId) throws org.openbaton.exceptions.NotFoundException {
    log.debug(("Listing all Applications running on VNFR with id: " + vnfrId));
    java.lang.Iterable<org.openbaton.vnfm.catalogue.Application> appsIterable = applicationRepository.findAppByVnfrId(vnfrId);
    if (!(appsIterable.iterator().hasNext())) {
        return new java.util.HashSet<>();
    }
    return fromIterbaleToSet(appsIterable);
}