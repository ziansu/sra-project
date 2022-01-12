public java.lang.String getElementInfo() {
    if (elementName.equals(elementId)) {
        return elementId;
    }else {
        return ((elementName) + "-") + (elementId);
    }
}