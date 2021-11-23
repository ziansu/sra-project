private java.lang.String[] getInterfaces(java.lang.Class<?> clazz) {
    java.lang.Class[] interfaces = clazz.getInterfaces();
    java.lang.String[] names = new java.lang.String[interfaces.length];
    for (int i = 0; i < (interfaces.length); i++) {
        names[i] = interfaces[i].getClass().getSimpleName();
    }
    return names;
}