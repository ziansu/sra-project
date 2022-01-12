protected void setAttributeValue(final java.lang.String attributeValue) {
    if (!(java.util.Objects.equals(this.attributeValue, attributeValue))) {
        this.attributeValue = attributeValue;
        setModified(true);
        invokeValueChangeListeners();
    }
}