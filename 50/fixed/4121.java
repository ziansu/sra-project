@java.lang.Override
public boolean isDefinedAt(java.lang.StackTraceElement stackTraceElement) {
    return ((location.getFileName()) != null) && (location.getFileName().equals(stackTraceElement.getFileName()));
}