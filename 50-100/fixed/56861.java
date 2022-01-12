private java.lang.reflect.Field findVersionField(java.lang.Class clazz) {
    java.lang.reflect.Field[] fields = org.apache.commons.lang3.reflect.FieldUtils.getFieldsWithAnnotation(clazz, org.springframework.data.annotation.Version.class);
    if ((fields == null) || ((fields.length) == 0)) {
        fields = org.apache.commons.lang3.reflect.FieldUtils.getFieldsWithAnnotation(clazz, javax.persistence.Version.class);
    }
    return (fields == null) || ((fields.length) == 0) ? null : fields[0];
}