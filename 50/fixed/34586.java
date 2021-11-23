public final java.lang.Object get(java.lang.String name, java.lang.Object defaultValue) {
    if ((context) != null) {
        return context.get(name);
    }
    return defaultValue;
}