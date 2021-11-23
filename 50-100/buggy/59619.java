public ru.osslabs.model.datasource.MetaObject getReferenceMetaObject(ru.osslabs.model.datasource.MetaObject metaObject, java.lang.String fieldName) {
    ru.osslabs.model.datasource.MetaObject result = null;
    if (metaObject.getChildren().containsKey(fieldName)) {
        result = metaObject.getChildren().get(fieldName).getSuperMetaObject();
    }
    return result;
}