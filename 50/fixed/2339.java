private boolean areMatchingTypes(@mockit.internal.util.Nonnull
java.lang.reflect.ParameterizedType declarationType, @mockit.internal.util.Nonnull
java.lang.reflect.ParameterizedType realizationType) {
    return (declarationType.getRawType().equals(realizationType.getRawType())) && (haveMatchingActualTypeArguments(declarationType, realizationType));
}