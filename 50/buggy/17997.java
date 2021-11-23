private nl.knaw.huygens.timbuctoo.model.DomainEntity getEntity(java.lang.String iname, java.lang.String id) {
    return repository.getEntityOrDefaultVariation(vre.mapTypeName(iname, true), id);
}