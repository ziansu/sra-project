@java.lang.SuppressWarnings(value = "unchecked")
public <T extends me.gerenciar.sjson.gateway.Gateway> T toObject(java.lang.String source) {
    T object = ((T) (reader.read(getClass(), source)));
    return object.className.equals(className) ? object : null;
}