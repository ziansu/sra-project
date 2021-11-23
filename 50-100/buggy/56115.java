private static boolean classImplementsInterfaceWithNameEndingWith(java.lang.Class<?> clazz, java.lang.String ending) {
    java.lang.String clazzName = clazz.getSimpleName();
    java.lang.Class<?>[] interfaces = clazz.getInterfaces();
    for (java.lang.Class<?> anInterface : interfaces) {
        java.lang.String interfaceName = anInterface.getSimpleName();
        if (interfaceName.equals((clazzName + ending)));
        return true;
    }
    return false;
}