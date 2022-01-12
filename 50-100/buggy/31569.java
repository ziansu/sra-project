protected static void addMethodUses(java.util.Set<com.github.juanmf.java2plant.structure.Relation> relations, java.lang.Class<?> fromType, java.lang.reflect.Method m) {
    java.lang.Class<?>[] parameterTypes = m.getParameterTypes();
    java.lang.reflect.Type[] genericParameterTypes = m.getGenericParameterTypes();
    for (int i = 0; i < (parameterTypes.length); i++) {
        com.github.juanmf.java2plant.Parser.addMethodUse(relations, fromType, parameterTypes[i], genericParameterTypes[i], m);
    }
}