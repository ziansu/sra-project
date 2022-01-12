@mockit.internal.util.NotNull
public static java.lang.StackTraceElement getElement(@mockit.internal.util.NotNull
java.lang.Throwable throwable, int index) {
    try {
        return ((java.lang.StackTraceElement) (mockit.internal.util.StackTrace.getStackTraceElement.invoke(throwable, index)));
    } catch (java.lang.IllegalAccessException e) {
        throw new java.lang.RuntimeException(e);
    } catch (java.lang.reflect.InvocationTargetException e) {
        throw new java.lang.RuntimeException(e);
    }
}