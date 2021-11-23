public static <T> T load(java.lang.String fileName, T object) {
    return hu.trigary.tgutils.SerializationUtils.Json.load(fileName, object, new com.google.common.reflect.TypeToken<T>() {    }.getType());
}