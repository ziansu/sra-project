@java.lang.Override
public dyvil.tools.compiler.ast.expression.IValue withType(dyvil.tools.compiler.ast.type.IType type, dyvil.tools.compiler.ast.generic.ITypeContext typeContext, dyvil.tools.parsing.marker.MarkerList markers, dyvil.tools.compiler.ast.context.IContext context) {
    if (dyvil.tools.compiler.ast.type.builtin.Types.isVoid(type)) {
        return this;
    }
    if ((this.value) == null) {
        return null;
    }
    dyvil.tools.compiler.ast.expression.IValue value1 = this.value.withType(type, typeContext, markers, context);
    if (value1 == null) {
        return null;
    }
    this.value = value1;
    return this;
}