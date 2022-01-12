public static java.lang.reflect.Method findMethod(java.lang.Class<?> type, java.lang.String name, java.lang.Class<?> argType) throws java.lang.NoSuchMethodException {
    try {
        if (argType == null)
            return type.getMethod(name);
        else
            return type.getMethod(name, argType);
        
    } catch (java.lang.NoSuchMethodException e) {
        if (argType == (java.lang.Object.class))
            throw new java.lang.NoSuchMethodException(name);
        else
            return pt.ist.ap.labs.Program.findMethod(type, name, argType.getSuperclass());
        
    }
}