@java.lang.Override
public void visitMethodInsn(int opcode, java.lang.String owner, java.lang.String name, java.lang.String desc) {
    if (((done) || (opcode != (org.objectweb.asm.Opcodes.INVOKESPECIAL))) || (!(org.caesarj.runtime.mixer.ConstructorMixer.isConstructor(name)))) {
        super.visitMethodInsn(opcode, owner, name, desc);
        return ;
    }
    done = true;
    super.visitMethodInsn(opcode, superClassName, name, this.desc);
}