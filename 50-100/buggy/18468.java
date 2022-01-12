@java.lang.SuppressWarnings(value = "unchecked")
public <T> void parse(byte[] bytes, T destination) {
    try {
        java.util.Map<java.lang.String, java.lang.Object> map = mapper.readValue(bytes, java.util.Map.class);
        org.rapidoid.beany.Beany.update(map, destination);
    } catch (java.lang.Exception e) {
        org.rapidoid.log.Log.error("Cannot parse JSON!", e);
        throw new java.lang.RuntimeException(e);
    }
}