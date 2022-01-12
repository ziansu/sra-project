@java.lang.SuppressWarnings(value = "unchecked")
public static final <T> T parseToObject(final byte[] json, final com.fasterxml.jackson.core.type.TypeReference<T> type) throws com.fasterxml.jackson.core.JsonParseException, com.fasterxml.jackson.databind.JsonMappingException, java.io.IOException {
    if (json == null)
        throw new java.lang.IllegalArgumentException("Incoming data was null");
    
    if (type == null)
        throw new java.lang.IllegalArgumentException("Missing type reference");
    
    return ((T) (net.opentsdb.utils.JSON.jsonMapper.readValue(json, type)));
}