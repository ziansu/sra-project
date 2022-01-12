@mockit.internal.util.NotNull
public java.lang.StackTraceElement getElement(int index) {
    if ((elements) != null) {
        return elements[index];
    }
    java.lang.StackTraceElement element;
    try {
        element = ((java.lang.StackTraceElement) (mockit.internal.util.StackTrace.getStackTraceElement.invoke(throwable, index)));
    } catch (java.lang.IllegalAccessException e) {
        throw new java.lang.RuntimeException(e);
    } catch (java.lang.reflect.InvocationTargetException e) {
        throw new java.lang.RuntimeException(e);
    }
    return element;
}