public static com.liferay.mobile.screens.ddl.model.Field.DataType valueOf(org.w3c.dom.Element element) {
    java.lang.String attributeValue = element.getAttribute("dataType");
    if (attributeValue == null) {
        return com.liferay.mobile.screens.ddl.model.Field.DataType.UNSUPPORTED;
    }
    return com.liferay.mobile.screens.ddl.model.Field.DataType.valueOfString(attributeValue);
}