public <T> boolean permitAccess(T document, com.geekhub.security.User user, java.util.function.BiPredicate<com.geekhub.security.User, T> predicate) {
    return predicate.test(user, document);
}