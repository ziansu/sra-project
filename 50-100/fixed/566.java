@java.lang.Override
public void assertPostCreateDomainPermissions(com.acciente.oacc.Resource accessorResource, com.acciente.oacc.DomainPermission domainPermission, com.acciente.oacc.DomainPermission... domainPermissions) {
    if (!(hasPostCreateDomainPermissions(accessorResource, domainPermission, domainPermissions))) {
        throw new com.acciente.oacc.NotAuthorizedException(accessorResource, (("receive " + (com.acciente.oacc.NotAuthorizedException.toString(domainPermission, domainPermissions))) + " permission(s) after creating a domain"));
    }
}