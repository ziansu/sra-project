@java.lang.Override
public boolean apply(T value) {
    return !(a.apply(value));
}