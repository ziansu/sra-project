private void inspectClassNames(java.lang.Class classObj) {
    java.lang.System.out.println(("Full Class Name: " + (classObj.getName())));
    java.lang.System.out.println(("Class Name: " + (classObj.getSimpleName())));
    java.lang.System.out.println(("Declaring Class Name: " + (classObj.getDeclaringClass())));
    java.lang.System.out.println(("Immediate Superclass: " + (classObj.getSuperclass().getName())));
    java.lang.System.out.println();
}