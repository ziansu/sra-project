@java.lang.Override
public void save(org.openstack.atlas.service.domain.services.impl.AccountLimit accountLimit) throws org.openstack.atlas.service.domain.exceptions.BadRequestException {
    try {
        org.openstack.atlas.service.domain.services.impl.AccountLimit dbLimit = accountLimitRepository.getByAccountIdAndType(accountLimit.getAccountId(), accountLimit.getLimitType());
        if (dbLimit != null) {
            throw new org.openstack.atlas.service.domain.exceptions.BadRequestException(((("A limit for the Limit Type " + (dbLimit.getLimitType().getName().toString())) + " already exists for the account id ") + (dbLimit.getAccountId())));
        }
    } catch (java.lang.Exception e) {
    }
    accountLimitRepository.save(accountLimit);
}