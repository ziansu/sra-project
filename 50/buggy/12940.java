@java.lang.Override
public java.lang.Object convert(java.lang.Object pojo, @java.lang.SuppressWarnings(value = "rawtypes")
java.lang.Class fieldType, java.lang.Object fieldName) {
    return org.fintx.util.Objects.deepClone(pojo);
}