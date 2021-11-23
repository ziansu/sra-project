public <T> boolean permitAccess(T file, com.geekhub.security.User user, java.util.function.BiPredicate<com.geekhub.security.User, T> predicate) {
    return ((file != null) && (user != null)) && (predicate.test(user, file));
}