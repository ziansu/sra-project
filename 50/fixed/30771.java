public java.lang.String getPerimiterAttribute(int index, java.lang.String attributeName) {
    int ix = attributes.getAttributeIndex(attributeName);
    return ix < (coreValues.length) ? null : perimeterValues[index][(ix - (coreValues.length))];
}