@java.lang.Override
public org.openstack.atlas.service.domain.services.impl.AccountLimit update(org.openstack.atlas.service.domain.services.impl.AccountLimit accountLimit) throws org.openstack.atlas.service.domain.exceptions.EntityNotFoundException {
    org.openstack.atlas.service.domain.services.impl.AccountLimit dbLimit = accountLimitRepository.getById(accountLimit.getId());
    if ((accountLimit.getAccountId()) != (dbLimit.getAccountId())) {
        java.lang.String errMsg = java.lang.String.format("Cannot access accountLimit {id=%d}", accountLimit.getId());
        throw new org.openstack.atlas.service.domain.exceptions.EntityNotFoundException(errMsg);
    }
    dbLimit.setLimit(accountLimit.getLimit());
    return accountLimitRepository.update(dbLimit);
}