@java.lang.Override
public boolean accept(final T arg) {
    return ((desiredType) == null) || (desiredType.equals(arg.getType()));
}