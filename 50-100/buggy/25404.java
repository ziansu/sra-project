@java.lang.Override
public amerifrance.guideapi.objects.abstraction.CategoryAbstract deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
    java.lang.String name = context.deserialize(json.getAsJsonObject().get("categoryType"), java.lang.String.class);
    return ((amerifrance.guideapi.objects.abstraction.CategoryAbstract) (amerifrance.guideapi.util.serialization.BookCreator.serializers.get(amerifrance.guideapi.util.serialization.BookCreator.idents.get(name)).deserialize(json, typeOfT, context)));
}