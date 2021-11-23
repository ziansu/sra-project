@java.lang.Override
public boolean accept(final T arg) {
    return ((desiredType) == null) || (arg.getType().equals(desiredType));
}