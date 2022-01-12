@java.lang.Override
public void writeInvJump(dyvil.tools.compiler.backend.MethodWriter writer, int varIndex, dyvil.tools.compiler.ast.type.IType matchedType, dyvil.tools.asm.Label elseLabel) throws dyvil.tools.compiler.backend.exception.BytecodeException {
    if ((this.variable) != null) {
        dyvil.tools.compiler.ast.pattern.IPattern.loadVar(writer, varIndex, matchedType);
        this.variable.writeInit(writer, null);
    }else
        if (varIndex < 0) {
            writer.writeInsn(Opcodes.AUTO_POP);
        }
    
}