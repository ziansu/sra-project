@java.lang.Override
public boolean apply(T value) {
    return !(predicate.apply(value));
}