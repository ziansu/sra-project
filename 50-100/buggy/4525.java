public java.lang.Object getRealAttributeValueFromObject(java.lang.Object object, java.lang.Object attribute) {
    boolean wasInstantiated = ((org.eclipse.persistence.indirection.ValueHolderInterface) (attribute)).isInstantiated();
    java.lang.Object value = super.getRealAttributeValueFromObject(object, attribute);
    if ((!wasInstantiated) && (value != attribute)) {
        updateValueInObject(object, value, attribute);
    }
    return value;
}