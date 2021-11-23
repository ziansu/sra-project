@java.lang.Override
public boolean isType(dyvil.tools.compiler.ast.type.IType type) {
    return (type == (dyvil.tools.compiler.ast.type.builtin.Types.VOID)) || ((!(((this.then) != null) && (!(this.then.isType(type))))) && (((this.elseThen) == null) || (this.elseThen.isType(type))));
}