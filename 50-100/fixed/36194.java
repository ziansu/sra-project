protected void writeArguments(dyvilx.tools.compiler.backend.MethodWriter writer, dyvilx.tools.compiler.ast.expression.IValue receiver, dyvilx.tools.compiler.ast.parameter.ArgumentList arguments) throws dyvilx.tools.compiler.backend.exception.BytecodeException {
    if ((((receiver != null) && (!(receiver.isIgnoredClassAccess()))) && (this.hasModifier(Modifiers.INFIX))) && (!(this.parameters.isEmpty()))) {
        arguments.writeValues(writer, this.parameters, 1);
        return ;
    }
    arguments.writeValues(writer, this.parameters, 0);
}