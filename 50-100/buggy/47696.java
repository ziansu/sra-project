public static com.liferay.mobile.screens.ddl.model.Field.DataType valueOfString(java.lang.String name) {
    com.liferay.mobile.screens.ddl.model.Field.DataType result = com.liferay.mobile.screens.ddl.model.Field.DataType.UNSUPPORTED;
    if (name != null) {
        for (com.liferay.mobile.screens.ddl.model.Field.DataType dataType : com.liferay.mobile.screens.ddl.model.Field.DataType.values()) {
            if (name.equals(dataType._value)) {
                return dataType;
            }
        }
        if ((name.equals("integer")) || (name.equals("double"))) {
            return com.liferay.mobile.screens.ddl.model.Field.DataType.NUMBER;
        }
    }
    return result;
}