@java.lang.Override
protected void deleteMetadata(final org.eclipse.hawkbit.repository.model.DistributionSet entity, final java.lang.String key, final java.lang.String value) {
    final org.eclipse.hawkbit.repository.model.DistributionSetMetadata dsMetaData = entityFactory.generateDistributionSetMetadata(entity, key, value);
    distributionSetManagement.deleteDistributionSetMetadata(entity, key);
}