public java.lang.String getElementInfo() {
    if (elementName.equals(elementId)) {
        return "g" + (elementId);
    }else {
        return (("h" + (elementName)) + "-") + (elementId);
    }
}