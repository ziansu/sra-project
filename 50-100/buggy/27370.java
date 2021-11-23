private void processInterface(javassist.bytecode.ClassFile classFile, java.io.File file) throws java.lang.RuntimeException {
    java.lang.String[] interfaces = classFile.getInterfaces();
    for (java.lang.String iface : interfaces) {
        if (interfaceInjectionPoints.contains(iface)) {
            if (interfaceImplementations.containsKey(iface)) {
                throw new java.lang.RuntimeException((("Interface-Implementierung für " + iface) + " ist nicht eindeutig!"));
            }
            de.ksw.kbse.di.ClassInfo classInfo = new de.ksw.kbse.di.ClassInfo(iface, currentClassPath, file);
            interfaceImplementations.put(iface, classInfo);
        }
    }
}