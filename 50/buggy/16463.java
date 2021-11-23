@java.lang.Override
public boolean accept(java.lang.Object event) {
    return (event != null) && (getEventType().isInstance(target));
}