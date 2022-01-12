java.lang.String getAttributeType() {
    if (((attributeTypeCombo) == null) | (attributeTypeCombo.isDisposed())) {
        return "";
    }
    return attributeTypeCombo.getText();
}