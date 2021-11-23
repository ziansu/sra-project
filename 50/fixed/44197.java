@java.lang.Override
public dyvil.tools.compiler.ast.expression.IValue resolveImplicit(dyvil.tools.compiler.ast.type.IType type) {
    return type == null ? this.implicitValue : super.resolveImplicit(type);
}