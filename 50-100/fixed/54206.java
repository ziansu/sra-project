@java.lang.Override
public boolean isWriteable(java.lang.Class<?> type, java.lang.reflect.Type genericType, java.lang.annotation.Annotation[] annotations, javax.ws.rs.core.MediaType mediaType) {
    if ((mediaType.getSubtype().equals("json")) || (mediaType.getSubtype().endsWith("+json"))) {
        return true;
    }
    return false;
}