private java.util.List<java.lang.Class> getAllClasses(java.lang.Object test) {
    java.util.List<java.lang.Class> classes = new java.util.ArrayList<java.lang.Class>();
    java.lang.Class currentClass = test.getClass();
    while (!(currentClass.equals(java.lang.Object.class))) {
        classes.add(currentClass);
        currentClass = currentClass.getSuperclass();
    } 
    return classes;
}