@java.lang.Override
public void writeExpression(dyvil.tools.compiler.backend.MethodWriter writer, dyvil.tools.compiler.ast.type.IType type) throws dyvil.tools.compiler.backend.exception.BytecodeException {
    if ((this.writer) != null) {
        this.writer.accept(writer, type);
    }
}