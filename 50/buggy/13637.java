public static void registerSerializer(amerifrance.guideapi.interfaces.ITypeReader<?> serializer) {
    amerifrance.guideapi.util.serialization.BookCreator.serializers.put(serializer.getType(), serializer);
    amerifrance.guideapi.util.serialization.BookCreator.idents.put(serializer.getClass().getSimpleName(), serializer.getClass());
}