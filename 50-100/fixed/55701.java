public java.lang.Object getObject() {
    java.lang.Class<?> clazz = getObjectClass();
    if (clazz == null) {
        throw new java.lang.IllegalStateException("Do not know what the class is that represents the JSON data");
    }
    try {
        return mapper.readValue(getMessage(), clazz);
    } catch (java.io.IOException e) {
        throw new java.lang.IllegalStateException("JSON message cannot be converted to object.", e);
    }
}