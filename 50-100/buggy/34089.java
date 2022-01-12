public static eu.esdihumboldt.hale.common.schema.model.TypeDefinition findOwningFeatureType(java.util.List<eu.esdihumboldt.hale.common.align.model.ChildContext> propertyPath) {
    int ftIdx = eu.esdihumboldt.hale.io.appschema.writer.internal.AppSchemaMappingUtils.findOwningFeatureTypeIndex(propertyPath);
    if (ftIdx >= 0) {
        return propertyPath.get(ftIdx).getChild().asProperty().getParentType();
    }else {
        return null;
    }
}