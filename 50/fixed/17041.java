protected java.lang.reflect.Constructor getConstructor() throws java.lang.NoSuchMethodException {
    if ((constructor) == null) {
        return name.kevinross.tool.ReflectionUtil.Invoker.findConstructor(getClazz(), getClasses());
    }
    return constructor;
}