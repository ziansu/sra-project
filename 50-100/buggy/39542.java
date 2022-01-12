@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.Set<org.n52.sos.config.SettingDefinition<?, ?>> getSettingDefinitions() {
    java.util.Set<org.n52.sos.config.SettingDefinition<?, ?>> settingDefinitions = super.getSettingDefinitions();
    return org.n52.sos.util.CollectionHelper.union(com.google.common.collect.Sets.<org.n52.sos.config.SettingDefinition<?, ?>>newHashSet(createInstanceDefinition(org.n52.sos.ds.datasource.AbstractSqlServerDatasource.INSTANCE_DEFAULT)), settingDefinitions);
}