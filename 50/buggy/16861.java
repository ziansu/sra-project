protected com.composum.sling.core.InheritedValues getInheritedValues() {
    if ((inheritedValues) == null) {
        inheritedValues = new com.composum.sling.core.InheritedValues(this, useNodeInheritance);
    }
    return inheritedValues;
}