private static int findOwningFeatureTypeIndex(java.util.List<eu.esdihumboldt.hale.common.align.model.ChildContext> propertyPath) {
    for (int i = (propertyPath.size()) - 1; i >= 0; i--) {
        eu.esdihumboldt.hale.common.align.model.ChildContext childContext = propertyPath.get(i);
        eu.esdihumboldt.hale.common.schema.model.TypeDefinition parentType = childContext.getChild().getParentType();
        if (eu.esdihumboldt.hale.io.appschema.writer.internal.AppSchemaMappingUtils.isFeatureType(parentType)) {
            return i;
        }
    }
    return -1;
}