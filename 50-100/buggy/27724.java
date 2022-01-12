public void createSubClass(ClassInheritanceHierarchy.ClassPackage pkg, java.lang.String name, int superPos) {
    ClassInheritanceHierarchy.Clazz superClazz = pkg.getClasses().get(superPos);
    ClassInheritanceHierarchy.Clazz c = ClassInheritanceHierarchyFactory.eINSTANCE.createClazz();
    c.setName(name);
    c.setSuperClass(superClazz);
    pkg.getClasses().add(c);
}