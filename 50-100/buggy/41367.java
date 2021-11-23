public static boolean isPublicConstructorFactory(com.cinnober.msgcodec.Factory<?> factory) {
    if ((factory.getClass()) != (com.cinnober.msgcodec.ConstructorFactory.class)) {
        return false;
    }
    java.lang.reflect.Constructor<?> constructor = ((com.cinnober.msgcodec.ConstructorFactory) (factory)).getConstructor();
    return (java.lang.reflect.Modifier.isPublic(constructor.getModifiers())) && (!(java.lang.reflect.Modifier.isAbstract(constructor.getDeclaringClass().getModifiers())));
}