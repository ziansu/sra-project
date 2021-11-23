protected static void addMethodUses(java.util.Set<com.github.juanmf.java2plant.structure.Relation> relations, java.lang.Class<?> fromType, java.lang.reflect.Method m) {
    java.lang.reflect.Type[] genericParameterTypes = m.getGenericParameterTypes();
    for (int i = 0; i < (genericParameterTypes.length); i++) {
        com.github.juanmf.java2plant.Parser.addMethodUse(relations, fromType, genericParameterTypes[i], m);
    }
}