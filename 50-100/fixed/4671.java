private java.util.function.Consumer wrapVoidMethod(java.lang.reflect.Method method) {
    return ( c) -> {
        try {
            method.invoke(this, c);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw new io.atomix.copycat.error.CommandException(e);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.AssertionError(e);
        }
    };
}