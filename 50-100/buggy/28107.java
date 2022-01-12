protected static void addConstructorUse(java.util.Set<com.github.juanmf.java2plant.structure.Relation> relations, java.lang.Class<?> fromType, java.lang.Class<?> toType, java.lang.reflect.Type fromParameterType, java.lang.reflect.Constructor<?> c) {
    java.lang.String name = (com.github.juanmf.java2plant.util.TypesHelper.getSimpleName(c.getName())) + "()";
    com.github.juanmf.java2plant.Parser.addUse(relations, fromType, toType, fromParameterType, c, name);
}