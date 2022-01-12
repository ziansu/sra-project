private java.lang.String getter(java.lang.reflect.Field field) {
    java.lang.String name = field.getName();
    if (field.getName().startsWith("is")) {
        return field.getName();
    }else
        if (field.getType().equals(java.lang.Boolean.class)) {
            return "is" + (com.github.javaparser.generator.utils.GeneratorUtils.capitalize(name));
        }
    
    return "get" + (com.github.javaparser.generator.utils.GeneratorUtils.capitalize(name));
}