@java.lang.Override
de.factoryfx.data.Data newInstance() {
    try {
        final de.factoryfx.data.DynamicData result = new de.factoryfx.data.DynamicData();
        for (de.factoryfx.data.AttributeAndName attributeAndName : dynamicDataAttributeAndNames) {
            final de.factoryfx.data.attribute.Attribute attribute = createAttribute(attributeAndName.attribute.getClass());
            attribute.metadata.labelText.internal_set(attributeAndName.attribute.metadata.labelText);
            result.dynamicDataAttributeAndNames.add(new de.factoryfx.data.AttributeAndName(attribute, attributeAndName.name));
        }
        return result;
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}