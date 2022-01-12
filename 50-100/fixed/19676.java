public void visitMethodInsn(int opcode, java.lang.String owner, java.lang.String name, java.lang.String desc, boolean itf) {
    if (((opcode == (org.objectweb.asm.Opcodes.INVOKESPECIAL)) && ((currentMethod) != null)) && (currentMethod.getName().equals(name))) {
        net.sf.cglib.core.Signature target = new net.sf.cglib.core.Signature(name, desc);
        if (!(target.equals(currentMethod))) {
            resolved.put(currentMethod, target);
        }
        currentMethod = null;
    }
}