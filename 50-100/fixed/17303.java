public org.mihalis.opal.propertyTable.PTProperty addProperty(final org.mihalis.opal.propertyTable.PTProperty property) {
    if (properties.contains(property)) {
        throw new java.lang.IllegalArgumentException((("A property called '" + (property.getName())) + "' has already been declared."));
    }
    properties.add(property);
    property.setParentTable(this);
    return property;
}