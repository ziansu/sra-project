@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public boolean matches(java.lang.Object item) {
    return (item instanceof java.util.Collection) && (everyItemMatches(((java.util.Collection<T>) (item)), matchers));
}