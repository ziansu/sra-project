@java.lang.Override
public final boolean canRead(com.google.common.net.MediaType mimeType, java.lang.reflect.Type resultType) {
    return java.lang.Void.TYPE.equals(com.google.common.reflect.TypeToken.of(resultType).getRawType());
}