@java.lang.Override
public final boolean canRead(com.google.common.net.MediaType mimeType, java.lang.reflect.Type resultType) {
    com.google.common.reflect.TypeToken type = com.google.common.reflect.TypeToken.of(resultType);
    return (java.lang.Void.TYPE.equals(type.getType())) || (canRead(mimeType, type.getRawType()));
}