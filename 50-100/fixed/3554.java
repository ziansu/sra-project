@java.lang.Override
public java.util.Map<java.lang.String, org.apache.tamaya.spi.PropertyValue> getProperties() {
    java.util.Map<java.lang.String, org.apache.tamaya.spi.PropertyValue> result = new java.util.HashMap<>();
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : properties.entrySet()) {
        org.apache.tamaya.spi.PropertyValue value = org.apache.tamaya.spi.PropertyValue.of(entry.getKey(), entry.getValue(), getName());
        result.put(entry.getKey(), value);
    }
    return result;
}