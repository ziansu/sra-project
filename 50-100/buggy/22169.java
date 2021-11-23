private void addRole(final com.enonic.xp.security.CreateRoleParams createRoleParams) {
    try {
        if (!(securityService.getRole(createRoleParams.getKey()).isPresent())) {
            securityService.createRole(createRoleParams);
            com.enonic.xp.core.impl.security.SecurityInitializer.LOG.info(("Role created: " + (createRoleParams.getKey().toString())));
        }
    } catch (java.lang.Throwable t) {
        com.enonic.xp.core.impl.security.SecurityInitializer.LOG.error(("Unable to initialize role: " + (createRoleParams.getKey().toString())), t);
    }
}