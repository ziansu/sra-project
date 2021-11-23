@java.lang.Override
public org.objectweb.asm.MethodVisitor visitMethod(int access, java.lang.String name, java.lang.String desc, java.lang.String signature, java.lang.String[] exceptions) {
    if ((!(name.equals("<init>"))) && (!(name.equals("<clinit>")))) {
        net.md_5.specialsource.Ownable method = new net.md_5.specialsource.Ownable(NodeType.METHOD, myName, name, desc, access);
        methods.add(method);
    }
    for (org.objectweb.asm.Type t : org.objectweb.asm.Type.getArgumentTypes(desc)) {
        visitType(t);
    }
    return methodVisitor;
}