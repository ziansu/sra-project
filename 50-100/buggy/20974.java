public boolean canExecute(java.lang.Object obj, org.romaframework.core.schema.SchemaClassElement iSchemaAction, org.romaframework.module.users.domain.AbstractAccount account) {
    java.lang.String[] readRules = iSchemaAction.getFeature(SecurityActionFeatures.ROLES);
    if ((readRules == null) || (readRules.equals(""))) {
        readRules = iSchemaAction.getEntity().getFeature(SecurityClassFeatures.EXECUTE_ROLES);
    }
    return matchesRule(iSchemaAction.toString(), account, readRules);
}