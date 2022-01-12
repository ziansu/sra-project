@java.lang.Override
public void assertPostCreateDomainPermissions(com.acciente.oacc.Resource accessorResource, com.acciente.oacc.DomainPermission domainPermission, com.acciente.oacc.DomainPermission... domainPermissions) {
    if (!(hasPostCreateDomainPermissions(accessorResource, domainPermission, domainPermissions))) {
        throw new com.acciente.oacc.NotAuthorizedException(accessorResource, (("receive " + (java.util.Arrays.asList(domainPermissions))) + " permission(s) after creating a domain"));
    }
}