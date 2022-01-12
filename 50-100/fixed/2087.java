public static com.liferay.mobile.screens.ddl.model.Field.EditorType valueOf(java.util.Map<java.lang.String, java.lang.Object> attributes) {
    java.lang.Object mapValue = attributes.get("type");
    if (mapValue == null) {
        return com.liferay.mobile.screens.ddl.model.Field.EditorType.UNSUPPORTED;
    }
    if (("text".equals(mapValue)) && ("integer".equals(attributes.get("dataType")))) {
        return com.liferay.mobile.screens.ddl.model.Field.EditorType.DECIMAL;
    }
    return com.liferay.mobile.screens.ddl.model.Field.EditorType.valueOfString(mapValue.toString());
}