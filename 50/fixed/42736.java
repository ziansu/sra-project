public static boolean isCustomJSONArrayPropertyType(org.sablo.specification.property.IPropertyType<?> propertyType) {
    return propertyType instanceof org.sablo.specification.property.CustomJSONArrayType<?, ?>;
}