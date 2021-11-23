public void createSubClass(ClassInheritanceHierarchy.ClassPackage pkg, java.lang.String name, int superPos) {
    ClassInheritanceHierarchy.Clazz superClazz = pkg.getClasses().get(superPos);
    ClassInheritanceHierarchy.Clazz c = ClassInheritanceHierarchyFactory.eINSTANCE.createClazz();
    pkg.getClasses().add(c);
    c.setName(name);
    c.setSuperClass(superClazz);
}