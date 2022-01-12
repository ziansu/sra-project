private boolean lookup(T object, spreadsheet.mapper.model.meta.FieldMeta fieldMeta) {
    java.lang.Class fieldType = spreadsheet.mapper.utils.FieldUtils.getFieldType(object.getClass(), spreadsheet.mapper.utils.FieldUtils.detectRealFieldName(fieldMeta).split("\\."));
    return (fieldType != null) && ((org.apache.commons.beanutils.ConvertUtils.lookup(fieldType)) != null);
}