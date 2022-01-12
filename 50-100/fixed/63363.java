static org.jboss.as.controller.ResourceDefinition getAddPrefixRoleMapperDefinition() {
    org.jboss.as.controller.AbstractAddStepHandler add = new org.wildfly.extension.elytron.RoleMapperDefinitions.RoleMapperAddHander(org.wildfly.extension.elytron.RoleMapperDefinitions.PREFIX) {
        @java.lang.Override
        protected org.wildfly.extension.elytron.TrivialService.ValueSupplier<org.wildfly.security.authz.RoleMapper> getValueSupplier(org.jboss.as.controller.OperationContext context, org.jboss.dmr.ModelNode model) throws org.jboss.as.controller.OperationFailedException {
            final java.lang.String prefix = org.wildfly.extension.elytron.RoleMapperDefinitions.PREFIX.resolveModelAttribute(context, model).asString();
            return () -> new org.wildfly.security.authz.AddPrefixRoleMapper(prefix);
        }
    };
    return new org.wildfly.extension.elytron.RoleMapperDefinitions.RoleMapperResourceDefinition(ElytronDescriptionConstants.ADD_PREFIX_ROLE_MAPPER, add, org.wildfly.extension.elytron.RoleMapperDefinitions.PREFIX);
}