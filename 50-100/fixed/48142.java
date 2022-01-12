public java.lang.Long save(@javax.validation.constraints.NotNull
@javax.validation.Valid
final org.diveintojee.poc.rollingupdate.domain.Domain domain) {
    final java.lang.Long id = sequence.addAndGet(1);
    domain.setId(id);
    org.diveintojee.poc.rollingupdate.domain.Domain persisted = repository.put(id, domain);
    org.diveintojee.poc.rollingupdate.service.DomainService.LOGGER.debug("Saved domain in db : {}", persisted);
    return id;
}