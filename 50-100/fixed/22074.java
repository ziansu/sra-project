protected static void addConstructorUses(java.util.Set<com.github.juanmf.java2plant.structure.Relation> relations, java.lang.Class<?> fromType, java.lang.reflect.Constructor<?> c) {
    java.lang.reflect.Type[] genericParameterTypes = c.getGenericParameterTypes();
    for (int i = 0; i < (genericParameterTypes.length); i++) {
        com.github.juanmf.java2plant.Parser.addConstructorUse(relations, fromType, genericParameterTypes[i], c);
    }
}