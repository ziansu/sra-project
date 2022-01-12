private <T> void setProperty(org.forgerock.opendj.config.client.ManagedObject<?> mo, org.forgerock.opendj.config.dsconfig.CreateSubCommandHandler.MyPropertyProvider provider, org.forgerock.opendj.config.PropertyDefinition<T> pd) {
    mo.setPropertyValues(pd, provider.getPropertyValues(pd));
}