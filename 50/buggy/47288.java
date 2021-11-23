private java.lang.String setter(java.lang.reflect.Field field) {
    return "set" + (com.github.javaparser.generator.utils.GeneratorUtils.capitalize(field.getName()));
}