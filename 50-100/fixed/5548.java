@java.lang.Override
public boolean canRead(@javax.annotation.Nonnull
com.google.common.net.MediaType mimeType, java.lang.reflect.Type resultType) {
    com.google.common.net.MediaType type = mimeType.withoutParameters();
    return (((type.is(com.google.common.net.MediaType.ANY_TEXT_TYPE)) || (com.google.common.net.MediaType.APPLICATION_XML_UTF_8.withoutParameters().is(type))) || (com.google.common.net.MediaType.JSON_UTF_8.withoutParameters().is(type))) && (java.lang.String.class.equals(com.google.common.reflect.TypeToken.of(resultType).getRawType()));
}