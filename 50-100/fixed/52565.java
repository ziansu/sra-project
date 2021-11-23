@java.lang.Override
public void assertPostCreateResourcePermissions(com.acciente.oacc.Resource accessorResource, java.lang.String resourceClassName, java.lang.String domainName, com.acciente.oacc.ResourcePermission resourcePermission, com.acciente.oacc.ResourcePermission... resourcePermissions) {
    if (!(hasPostCreateResourcePermissions(accessorResource, resourceClassName, domainName, resourcePermission, resourcePermissions))) {
        throw new com.acciente.oacc.NotAuthorizedException(accessorResource, ((((("receive " + (com.acciente.oacc.NotAuthorizedException.toString(resourcePermission, resourcePermissions))) + " permission(s) after creating a ") + resourceClassName) + " resource in domain ") + domainName));
    }
}