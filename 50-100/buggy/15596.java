private void printConstructorInfo(java.lang.reflect.Constructor c) {
    java.lang.System.out.println(("Constructor Name: " + (c.getName())));
    int modifiers = c.getModifiers();
    java.lang.System.out.println(("Constructor Modifiers: " + (java.lang.reflect.Modifier.toString(modifiers))));
    printParameters(c.getParameterTypes());
    java.lang.System.out.println();
    printExceptions(c.getExceptionTypes());
    printSeparator();
}