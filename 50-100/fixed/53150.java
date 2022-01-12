@java.lang.Override
public void run() {
    try {
        this.method.invoke(null, ((java.lang.Object) (this.passed)));
    } catch (final java.lang.reflect.InvocationTargetException ex) {
        throw new java.lang.IllegalStateException(ex);
    } catch (final java.lang.IllegalAccessException ex) {
        throw new java.lang.IllegalStateException(ex);
    }
}