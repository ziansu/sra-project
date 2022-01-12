@java.lang.Override
public long getSize(java.lang.Object o, java.lang.Class<?> type, java.lang.reflect.Type genericType, java.lang.annotation.Annotation[] annotations, javax.ws.rs.core.MediaType mediaType) {
    org.smallmind.web.jersey.jackson.JsonProvider.WRITE_BUFFER_LOCAL.set(new java.io.ByteArrayOutputStream());
    try {
        org.smallmind.web.jersey.util.JsonCodec.writeToStream(org.smallmind.web.jersey.jackson.JsonProvider.WRITE_BUFFER_LOCAL.get(), o);
        return org.smallmind.web.jersey.jackson.JsonProvider.WRITE_BUFFER_LOCAL.get().size();
    } catch (java.lang.Throwable throwable) {
        throw new javax.ws.rs.WebApplicationException(throwable);
    }
}