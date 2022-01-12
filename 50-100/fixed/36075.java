@java.lang.Override
public void parseFormatString(final org.structr.schema.Schema entity, final java.lang.String expression) throws org.structr.common.error.FrameworkException {
    if ((expression == null) || (expression.isEmpty())) {
        reportError(new org.structr.common.error.InvalidPropertySchemaToken(org.structr.core.entity.SchemaNode.class.getSimpleName(), expression, "invalid_property_reference", "Empty property reference."));
        return ;
    }
    auxType = (", " + expression) + "Property";
}