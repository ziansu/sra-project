public org.mihalis.opal.propertyTable.PTProperty addProperty(final org.mihalis.opal.propertyTable.PTProperty property) {
    if (this.properties.contains(property)) {
        throw new java.lang.IllegalArgumentException((("A property called '" + (property.getName())) + "' has already been declared."));
    }
    this.properties.add(property);
    property.setParentTable(this);
    return property;
}