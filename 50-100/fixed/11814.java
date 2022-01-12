private static org.elasticsearch.hadoop.serialization.dto.mapping.Field skipHeaders(org.elasticsearch.hadoop.serialization.dto.mapping.Field field) {
    org.elasticsearch.hadoop.serialization.dto.mapping.Field[] props = field.properties();
    if (((((props.length) > 0) && ((props[0]) != null)) && ("mappings".equals(props[0].name()))) && (FieldType.OBJECT.equals(props[0].type()))) {
        return props[0].properties()[0];
    }
    return field;
}