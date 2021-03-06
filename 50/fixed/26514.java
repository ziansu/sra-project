@java.lang.Override
public void visitInsn(int opcode) {
    switch (opcode) {
        case org.objectweb.asm.Opcodes.IDIV :
            opcode = org.objectweb.asm.Opcodes.IMUL;
            break;
        case org.objectweb.asm.Opcodes.IMUL :
            opcode = org.objectweb.asm.Opcodes.IDIV;
            break;
    }
    mv.visitInsn(opcode);
}