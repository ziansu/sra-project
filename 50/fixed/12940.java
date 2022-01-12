@java.lang.Override
public java.lang.Object convert(java.lang.Object value, @java.lang.SuppressWarnings(value = "rawtypes")
java.lang.Class target, java.lang.Object context) {
    return org.fintx.util.Objects.deepClone(value);
}