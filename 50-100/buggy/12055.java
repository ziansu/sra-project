protected static void addMethodUse(java.util.Set<com.github.juanmf.java2plant.structure.Relation> relations, java.lang.Class<?> fromType, java.lang.Class<?> toType, java.lang.reflect.Type fromParameterType, java.lang.reflect.Method m) {
    java.lang.String name = (com.github.juanmf.java2plant.util.TypesHelper.getSimpleName(m.getName())) + "()";
    com.github.juanmf.java2plant.Parser.addUse(relations, fromType, toType, fromParameterType, m, name);
}