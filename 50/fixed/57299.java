@java.lang.SuppressWarnings(value = "unchecked")
public <T extends me.gerenciar.sjson.gateway.Gateway> T toObject(java.lang.String source) {
    return ((T) (reader.read(getClass(), source)));
}