public static <T, C extends java.util.Collection<T>> java.util.Optional<C> getOptional(C collection) {
    return java.util.Optional.<C>ofNullable(collection).filter(kr.jm.utils.helper.JMPredicate.getBoolean(((collection.size()) > 0)));
}