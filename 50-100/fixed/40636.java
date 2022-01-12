private void getConstructor(java.lang.Class clazz, java.lang.reflect.Constructor constructor, int numberOfTabs) {
    getAnnotations(constructor.getDeclaredAnnotations(), numberOfTabs);
    getTabs(numberOfTabs);
    getModifiers(constructor.getModifiers());
    sb.append(clazz.getSimpleName()).append("(");
    getParameters(constructor.getParameters());
    sb.append(")");
    getExceptions(constructor.getExceptionTypes());
    sb.append(";\n\n");
}