@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public boolean matches(java.lang.Object item) {
    if (!(item instanceof java.util.Collection)) {
        return false;
    }
    return everyItemMatches(((java.util.Collection<T>) (item)), matchers);
}