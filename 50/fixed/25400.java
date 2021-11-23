public static com.liferay.mobile.screens.ddl.model.Field.DataType valueOf(java.util.Map<java.lang.String, java.lang.Object> attributes) {
    java.lang.Object mapValue = attributes.get("dataType");
    if (mapValue == null) {
        return com.liferay.mobile.screens.ddl.model.Field.DataType.UNSUPPORTED;
    }
    return com.liferay.mobile.screens.ddl.model.Field.DataType.valueOfString(mapValue.toString());
}