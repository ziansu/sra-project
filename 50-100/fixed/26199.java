public java.lang.String getFieldName(ru.osslabs.model.datasource.MetaObject metaObject, java.lang.String fieldName) {
    java.lang.String result = "";
    if (metaObject != null) {
        if (metaObject.getChildren().containsKey(fieldName)) {
            result = metaObject.getChildren().get(fieldName).getName();
        }
    }
    return result;
}