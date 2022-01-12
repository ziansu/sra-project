protected static void addConstructorUses(java.util.Set<com.github.juanmf.java2plant.structure.Relation> relations, java.lang.Class<?> fromType, java.lang.reflect.Constructor<?> c) {
    java.lang.Class<?>[] parameterTypes = c.getParameterTypes();
    java.lang.reflect.Type[] genericParameterTypes = c.getGenericParameterTypes();
    for (int i = 0; i < (parameterTypes.length); i++) {
        com.github.juanmf.java2plant.Parser.addConstructorUse(relations, fromType, parameterTypes[i], genericParameterTypes[i], c);
    }
}