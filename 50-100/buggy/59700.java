private void addPolicy(java.lang.String resourceId, java.lang.String internalId, eu.h2020.symbiote.security.accesspolicies.IAccessPolicy accPolicy) throws eu.h2020.symbiote.security.commons.exceptions.custom.InvalidArgumentsException {
    try {
        if (accPolicy instanceof eu.h2020.symbiote.security.accesspolicies.common.singletoken.SingleTokenAccessPolicySpecifier) {
            eu.h2020.symbiote.security.accesspolicies.IAccessPolicy policy = eu.h2020.symbiote.security.accesspolicies.common.SingleTokenAccessPolicyFactory.getSingleTokenAccessPolicy(((eu.h2020.symbiote.security.accesspolicies.common.singletoken.SingleTokenAccessPolicySpecifier) (accPolicy)));
            eu.h2020.symbiote.resources.db.AccessPolicy ap = new eu.h2020.symbiote.resources.db.AccessPolicy(resourceId, internalId, policy);
            accessPolicyRepository.save(ap);
        }
    } catch (eu.h2020.symbiote.security.commons.exceptions.custom.InvalidArgumentsException e) {
        eu.h2020.symbiote.interfaces.ResourceRegistration.log.error(("Invalid Policy definition for resource with id " + resourceId));
        throw e;
    }
}