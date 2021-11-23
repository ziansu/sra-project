@java.lang.Override
public com.google.gson.JsonElement serialize(com.microsoft.graph.model.DateOnly src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
    if (src == null) {
        return null;
    }
    return new com.google.gson.JsonPrimitive(com.microsoft.graph.serializer.DateOnlySerializer.serialize(src));
}