@java.lang.Override
public void visit(int version, int access, java.lang.String name, java.lang.String signature, java.lang.String superName, java.lang.String[] interfaces) {
    superclass = getClassFromInternalName(superName);
    for (java.lang.String iface : interfaces) {
        interfaceList.add(getClassFromInternalName(iface));
    }
    return ;
}