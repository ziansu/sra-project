@java.lang.Override
public void delete(org.openstack.atlas.service.domain.services.impl.AccountLimit accountLimit) throws org.openstack.atlas.service.domain.exceptions.EntityNotFoundException {
    org.openstack.atlas.service.domain.services.impl.AccountLimit dbLimit = accountLimitRepository.getById(accountLimit.getId());
    if ((accountLimit.getAccountId()) != (dbLimit.getAccountId())) {
        java.lang.String errMsg = java.lang.String.format("Cannot access accountLimit {id=%d}", accountLimit.getId());
        throw new org.openstack.atlas.service.domain.exceptions.EntityNotFoundException(errMsg);
    }
    accountLimitRepository.delete(accountLimit);
}