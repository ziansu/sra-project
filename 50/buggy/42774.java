@java.lang.SuppressWarnings(value = "unchecked")
public T newInstance(java.lang.Object... args) {
    try {
        return ((T) (constructor.newInstance(args)));
    } catch (java.lang.Throwable t) {
        throw new java.lang.RuntimeException("WELP");
    }
}