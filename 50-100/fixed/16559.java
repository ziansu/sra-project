public boolean mustDoNotNullCheck(org.molgenis.data.meta.model.EntityType entityType, org.molgenis.data.meta.model.Attribute attr, org.molgenis.data.Entity entity) {
    if ((org.apache.commons.lang3.StringUtils.isNotBlank(attr.getVisibleExpression())) && (!(org.molgenis.data.validation.ValidationUtils.resolveBooleanExpression(attr.getVisibleExpression(), entity, entityType))))
        return false;
    
    return true;
}