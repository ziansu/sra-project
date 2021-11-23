public java.lang.String getReferenceTable(ru.osslabs.model.datasource.MetaObject metaObject, java.lang.String fieldName) {
    java.lang.String result = "";
    if (metaObject.getChildren().containsKey(fieldName)) {
        result = metaObject.getChildren().get(fieldName).getType().getSecondary();
    }
    return result;
}