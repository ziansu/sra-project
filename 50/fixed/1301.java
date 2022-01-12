@java.lang.Override
public com.google.gson.JsonElement serialize(final com.microsoft.graph.model.DateOnly src, final java.lang.reflect.Type typeOfSrc, final com.google.gson.JsonSerializationContext context) {
    if (src == null) {
        return null;
    }
    return new com.google.gson.JsonPrimitive(src.toString());
}