public static <T extends cx2x.xcodeml.helper.XbaseElement> T createEmpty(java.lang.Class<T> xElementClass, cx2x.xcodeml.helper.XcodeProgram xcodeml) {
    java.lang.String elementName = cx2x.xcodeml.helper.XelementName.getElementNameFromClass(xElementClass);
    if (elementName != null) {
        org.w3c.dom.Element element = xcodeml.getDocument().createElement(elementName);
        try {
            return xElementClass.getDeclaredConstructor(org.w3c.dom.Element.class).newInstance(element);
        } catch (java.lang.Exception ex) {
            return null;
        }
    }
    return null;
}