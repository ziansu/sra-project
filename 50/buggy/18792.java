private <T> void setProperty(org.forgerock.opendj.config.client.ManagedObject<?> mo, org.forgerock.opendj.config.dsconfig.CreateSubCommandHandler.MyPropertyProvider provider, org.forgerock.opendj.config.PropertyDefinition<T> pd) {
    java.util.Collection<T> values = provider.getPropertyValues(pd);
    mo.setPropertyValues(pd, values);
}