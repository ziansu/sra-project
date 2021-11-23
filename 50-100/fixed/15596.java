private void printConstructorInfo(java.lang.reflect.Constructor c) {
    java.lang.System.out.println(("Constructor Name: " + (c.getName())));
    java.lang.System.out.println(("Constructor Modifiers: " + (java.lang.reflect.Modifier.toString(c.getModifiers()))));
    java.lang.System.out.println();
    printParameters(c.getParameterTypes());
    printSeparator();
}